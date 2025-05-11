/***********************************************************************
 * Module:  Client.java
 * Author:  DELL
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid f71f4877-fd8d-48d0-b1ee-35a1ce6a3011 */
public class Client extends Users {
   /** @pdOid 7b962e4c-d00c-405a-992f-47f8d327280e */
   public int clientId;
   
   /** @pdRoleInfo migr=no name=Review assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Review> review;
   
   /** @pdOid 9ad4d9c1-e833-4ea7-a555-1b2132839a4d */
   public void signupClient() {
      // TODO: implement
   }
   
   /** @pdOid 7c48e739-b8b9-45e1-8c1d-fc4159b543cf */
   public List<Service> getAllServices() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid aa0c951b-ee43-4cf3-afa6-81c82df75354 */
   public void bookService() {
      // TODO: implement
   }
   
   /** @pdOid 3e24b109-ad44-4e9f-896b-2e5081b5c0d1 */
   public Service getAdDetailsByAdId_adId_() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 0bd55e76-981f-4ed4-b36a-559b1a1b0523 */
   public void giveReview() {
      // TODO: implement
   }
   
   /** @pdOid 3437b427-6fdd-4b68-be0e-17bfe8cbd5f6 */
   public List<Booking> getAllBookingsByUserId_clientId_() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid cda4caf1-face-47d9-85c6-94b8e716f6ef */
   public List<Service> searchAdByName_serviceName_() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 927b8ad8-6ac4-4fba-a522-af599c2eabc3 */
   public Review findReviewByAdId_resId_() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Review> getReview() {
      if (review == null)
         review = new java.util.HashSet<Review>();
      return review;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReview() {
      if (review == null)
         review = new java.util.HashSet<Review>();
      return review.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReview */
   public void setReview(java.util.Collection<Review> newReview) {
      removeAllReview();
      for (java.util.Iterator iter = newReview.iterator(); iter.hasNext();)
         addReview((Review)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReview */
   public void addReview(Review newReview) {
      if (newReview == null)
         return;
      if (this.review == null)
         this.review = new java.util.HashSet<Review>();
      if (!this.review.contains(newReview))
         this.review.add(newReview);
   }
   
   /** @pdGenerated default remove
     * @param oldReview */
   public void removeReview(Review oldReview) {
      if (oldReview == null)
         return;
      if (this.review != null)
         if (this.review.contains(oldReview))
            this.review.remove(oldReview);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReview() {
      if (review != null)
         review.clear();
   }

}