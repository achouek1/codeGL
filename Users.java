/***********************************************************************
 * Module:  Users.java
 * Author:  DELL
 * Purpose: Defines the Class Users
 ***********************************************************************/

import java.util.*;

/** @pdOid 07375155-b2bc-4a35-8708-1ee40770b855 */
public class Users {
   /** @pdOid ab5db051-353f-47b8-a68a-4d8ec5b2ee4a */
   public Long id;
   /** @pdOid a06f31f9-e432-4461-ac01-6ca2f4708c41 */
   public String email;
   /** @pdOid e4e27aa7-aac6-4c87-883d-5f8496ef09fa */
   public String lastname;
   /** @pdOid 4925010d-4feb-4be9-b48c-d2353b05e64b */
   public String name;
   /** @pdOid 8c5a54f7-201f-47a3-b5df-63a9c8f22082 */
   public String password;
   /** @pdOid 35384a3e-fe87-4293-8786-c6ffe3bd8785 */
   public Long phone;
   /** @pdOid 09fc8da3-5389-44ee-b30b-d2800e71d0e3 */
   public UserRole role;
   
   /** @pdRoleInfo migr=no name=Services assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Services> services;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Services> getServices() {
      if (services == null)
         services = new java.util.HashSet<Services>();
      return services;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorServices() {
      if (services == null)
         services = new java.util.HashSet<Services>();
      return services.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newServices */
   public void setServices(java.util.Collection<Services> newServices) {
      removeAllServices();
      for (java.util.Iterator iter = newServices.iterator(); iter.hasNext();)
         addServices((Services)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newServices */
   public void addServices(Services newServices) {
      if (newServices == null)
         return;
      if (this.services == null)
         this.services = new java.util.HashSet<Services>();
      if (!this.services.contains(newServices))
         this.services.add(newServices);
   }
   
   /** @pdGenerated default remove
     * @param oldServices */
   public void removeServices(Services oldServices) {
      if (oldServices == null)
         return;
      if (this.services != null)
         if (this.services.contains(oldServices))
            this.services.remove(oldServices);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllServices() {
      if (services != null)
         services.clear();
   }

}