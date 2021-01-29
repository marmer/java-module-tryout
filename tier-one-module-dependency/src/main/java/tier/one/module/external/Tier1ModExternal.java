package tier.one.module.external;

import tier.two.module.module.external.Tier2ModModExternal;
import tier.two.module.module.internal.Tier2ModModInternal;
import tier.two.module.non.module.external.Tier2ModNonModExternal;
import tier.two.module.non.module.internal.Tier2ModNonModInternal;

public class Tier1ModExternal {

    public String getExternalValue() {
        new Tier2ModModExternal().getExternalValue();
        new Tier2ModModInternal().getInternalValue();
        new Tier2ModNonModExternal().getExternalValue();
        new Tier2ModNonModInternal().getInternalValue();
        return "tier.one.module.external.Tier1ModExternal.getExternalValue";
    }
}
