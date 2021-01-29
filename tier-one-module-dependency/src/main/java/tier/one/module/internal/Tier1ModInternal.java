package tier.one.module.internal;

import tier.two.module.module.external.Tier2ModModExternal;
import tier.two.module.module.internal.Tier2NodModInternal;
import tier.two.module.non.module.external.Tier2ModNonModExternal;
import tier.two.module.non.module.internal.Tier2ModNonModInternal;

public class Tier1ModInternal {

    public String getInternalValue() {
        new Tier2ModModExternal().getExternalValue();
        new Tier2NodModInternal().getInternalValue();
        new Tier2ModNonModExternal().getExternalValue();
        new Tier2ModNonModInternal().getInternalValue();
        return "tier.one.module.internal.Tier1ModInternal.getInternalValue";
    }
}
