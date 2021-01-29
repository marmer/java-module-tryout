package tier.one.non.module.external;

import tier.two.non.module.module.external.Tier2NonModModExternal;
import tier.two.non.module.module.internal.Tier2NonModModInternal;
import tier.two.non.module.non.module.external.Tier2NonModNonModExternal;
import tier.two.non.module.non.module.internal.Tier2NonModNonModInternal;

public class Tier2NonModExternal {

    public String getExternalValue() {
        new Tier2NonModModExternal().getExternalValue();
        new Tier2NonModModInternal().getInternalValue();
        new Tier2NonModNonModExternal().getExternalValue();
        new Tier2NonModNonModInternal().getInternalValue();
        return "tier.one.non.module.external.Tier1NonModExternal.getExternalValue";
    }
}
