/*
 * Scilab ( http://www.scilab.org/ ) - This file is part of Scilab
 * Copyright (C) 2012 - Scilab Enterprises - Calixte DENIZET
 * Copyright (C) 2013 - Scilab Enterprises - Sylvestre Ledru
 *
 * Copyright (C) 2012 - 2016 - Scilab Enterprises
 *
 * This file is hereby licensed under the terms of the GNU GPL v2.0,
 * pursuant to article 5.3.4 of the CeCILL v.2.1.
 * This file was originally licensed under the terms of the CeCILL v2.1,
 * and continues to be available under such terms.
 * For more information, see the COPYING file which you should have received
 * along with this program.
 *
 */

#include "ScilabJavaEnvironment.hxx"
#include "ScilabGateway.hxx"

extern "C" {
#include "configvariable_interface.h"
#include "Scierror.h"
#include "gw_external_objects_java.h"
}

using namespace org_scilab_modules_external_objects_java;
using namespace org_modules_external_objects;

int sci_jconvMatrixMethod(char * fname, void* pvApiCtx)
{
    int envId;
    char * type = 0;

    CheckInputArgument(pvApiCtx, 0, 1);
    CheckOutputArgument(pvApiCtx, 1, 1);
    if (getWarningMode())
    {
        sciprint(_("%s: Function %s is obsolete.\n"), _("Warning"), fname);
        sciprint(_("%s: Please see documentation for more details.\n"), _("Warning"));
        sciprint(_("%s: This function will be permanently removed in Scilab %s\n\n"), _("Warning"), "6.0.0");
    }

    envId = ScilabJavaEnvironment::start();
    JavaOptionsSetter setter = ScilabJavaEnvironment::getInstance()->getOptionsHelper().getSetter(JavaOptionsSetter::METHODOFCONV);
    ScilabAbstractEnvironment & env = ScilabEnvironments::getEnvironment(envId);
    ScilabGatewayOptions & options = env.getGatewayOptions();
    OptionsHelper::setCopyOccurred(false);
    ScilabObjects::initialization(env, pvApiCtx);
    options.setIsNew(false);

    if (Rhs == 0)
    {
        const char * order = setter.get() ? "rc" : "cr";
        createMatrixOfString(pvApiCtx, Rhs + 1, 1, 1, &order);

        LhsVar(1) = 1;
        PutLhsVar();

        return 0;
    }

    try
    {
        type = ScilabObjects::getSingleString(Rhs, pvApiCtx);
    }
    catch (const std::exception & e)
    {
        Scierror(999, "%s: String \"rc\" or \"cr\" expected.", fname);
        return 0;
    }

    if (!strcmp(type, "rc"))
    {
        setter.set(true);
    }
    else if (!strcmp(type, "cr"))
    {
        setter.set(false);
    }
    else
    {
        FREE(type);
        Scierror(999, "%s: Invalid string: \"rc\" or \"cr\" expected.", fname);
        return 0;
    }

    FREE(type);

    LhsVar(1) = 0;
    PutLhsVar();

    return 0;
}
