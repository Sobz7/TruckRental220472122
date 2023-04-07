//PRotection Factory class
// java class
// Author: Jordy Meye (220072841)
// Date: 24 03 2023


package za.ac.cput.factory;

import za.ac.cput.domain.Protection;

public class ProtectionFactory {

    public static Protection createProtection( String insuranceId, String truckId, String policyType, String startDate, String endDate){



        return new Protection.Builder().setInsuranceId(insuranceId).setTruckId(truckId).setPolicyType(policyType).setStartDate(startDate).setEndDate(endDate).build();
    }
}
