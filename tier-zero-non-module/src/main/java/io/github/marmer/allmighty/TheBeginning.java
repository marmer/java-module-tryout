package io.github.marmer.allmighty;

import tier.one.module.external.Tier1ModExternal;
import tier.one.module.internal.Tier1ModInternal;
import tier.one.non.module.external.Tier2NonModExternal;
import tier.one.non.module.internal.Tier2NonModInternal;
import tier.two.module.module.internal.Tier2ModModInternal;
import tier.two.module.non.module.external.Tier2ModNonModExternal;
import tier.two.module.non.module.internal.Tier2ModNonModInternal;
import tier.two.non.module.module.external.Tier2NonModModExternal;
import tier.two.non.module.module.internal.Tier2NonModModInternal;
import tier.two.non.module.non.module.external.Tier2NonModNonModExternal;
import tier.two.non.module.non.module.internal.Tier2NonModNonModInternal;

public class TheBeginning {

    public static void main(final String... args) {
        //Test Internal tier 1 module
        new Tier1ModInternal().getInternalValue();

        //Test external tier 1 module
        new Tier1ModExternal().getExternalValue();

        //Test Internal tier 2 module-module
        new tier.two.module.module.external.Tier2ModModExternal().getExternalValue();
        //Test external tier 2 module-module
        new Tier2ModModInternal().getInternalValue();

        //Test Internal tier 2 module-non-module
        new Tier2ModNonModInternal().getInternalValue();
        //Test external tier 2 module-non-module
        new Tier2ModNonModExternal().getExternalValue();

        //Test Internal tier 1 non-module
        new Tier2NonModExternal().getExternalValue();
        //Test external tier 1 non-module
        new Tier2NonModInternal().getInternalValue();

        //Test Internal tier 2 non-module-module
        new Tier2NonModModInternal().getInternalValue();
        //Test external tier 2 non-module-module
        new Tier2NonModModExternal().getExternalValue();

        //Test Internal tier 2 non-module-non-module
        new Tier2NonModNonModInternal().getInternalValue();
        //Test external tier 2 non-module-non-module
        new Tier2NonModNonModExternal().getExternalValue();
    }
}
