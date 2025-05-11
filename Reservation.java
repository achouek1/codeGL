/***********************************************************************
 * Module:  Reservation.java
 * Author:  DELL
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid 832ce22e-5f29-4000-a8c4-3f88fae3c4d9 */
public class Reservation {
   /** @pdOid de43a1ca-a12d-462b-8478-d6fe53182370 */
   public int resId;
   /** @pdOid 106bde6c-72cb-41dd-9437-5cb22c87eca2 */
   public Date bookDate;
   /** @pdOid b42f51d5-6e88-4651-9460-61288e93b1ca */
   public ReservationStatus reservationStatus;
   /** @pdOid 031672ee-2c5f-4b74-aefb-625cda7ff366 */
   public int adId;
   /** @pdOid fd88d432-c5b9-4a69-ac67-5f26b27f264e */
   public int companyId;
   /** @pdOid bf7593c1-5a95-4cc1-bccd-a02e8e11439b */
   public int clientId;
   /** @pdOid 23bf56fc-2a50-4568-9284-1bbb81dddb73 */
   public ReviewStatus reviewStatus;
   
   /** @pdRoleInfo migr=no name=Client assc=association5 mult=1 */
   public Client client;

}