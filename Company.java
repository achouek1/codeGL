/***********************************************************************
 * Module:  Company.java
 * Author:  DELL
 * Purpose: Defines the Class Company
 ***********************************************************************/

import java.util.*;

/** @pdOid f97eea7a-1f3e-4a0a-a19e-b71696ecd14a */
public class Company extends Users {
   /** @pdOid 927143db-61ef-4a06-89b8-2f4c9b4e822a */
   public int companyId;
   
   /** @pdRoleInfo migr=no name=Reservation assc=association6 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Reservation> reservation;
   
   /** @pdOid 80e09bfe-ada8-47b7-9b73-bc52321f2b37 */
   public void signupCompany() {
      // TODO: implement
   }
   
   /** @pdOid e0da2f0c-e488-421e-9962-e1cad4095983 */
   public void postService() {
      // TODO: implement
   }
   
   /** @pdOid f5193743-c6e9-4b27-9dba-6af3a79cad1c */
   public 	List<Service> getAllServicesByUserId() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid be859037-1625-4904-9401-7cd99b340555 */
   public Service getAdById() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f2f922eb-1b37-4671-9483-39927e70c78c */
   public void updateAd() {
      // TODO: implement
   }
   
   /** @pdOid 6d344999-72fc-4e84-8f17-1e800050771a */
   public void deleteAd() {
      // TODO: implement
   }
   
   /** @pdOid 3d1546c1-38d2-4615-a769-b43d658b343b */
   public List<Booking> getAllAdBookings() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 39f52184-df96-4e43-a048-3d95ca883212 */
   public void changeBookingStatus() {
      // TODO: implement
   }
   
   /** @pdOid 9ea60b32-dbbf-4505-89e3-db20ac56361b */
   public List<Service> searchAdByName() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 337ef4b7-a5be-4ca7-b90a-745effc78c7d */
   public 	Review findReviewByAdId() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
         this.reservation.add(newReservation);
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
            this.reservation.remove(oldReservation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
         reservation.clear();
   }

}