/***********************************************************************
 * Module:  Services.java
 * Author:  DELL
 * Purpose: Defines the Class Services
 ***********************************************************************/

import java.util.*;

/** @pdOid e00005f5-5643-4966-a09a-c52870601823 */
public class Services {
   /** @pdOid 6477936f-b1bf-4e10-8f5f-1cc04b19670f */
   public long AdId;
   /** @pdOid d25b8da8-9c4b-4a64-a831-da7d8e0ffa7f */
   public String Description;
   /** @pdOid 744f5025-1603-4b54-a2f1-aa9dd3f56f52 */
   public java.lang.Byte Img;
   /** @pdOid 37a460fd-e093-4ca4-be04-41e37b45f7b1 */
   public java.lang.Double price;
   /** @pdOid 737088bc-811c-41cd-ac73-f95f96753d3c */
   public String serviceName;
   /** @pdOid 3fbcc6aa-fbf8-4d40-934b-77df95593930 */
   public int clientId;
   /** @pdOid 6c29d23a-a0a4-465d-9c49-45022a9d342c */
   public int companyId;
   
   /** @pdRoleInfo migr=no name=Reservation assc=association2 mult=1 type=Composition */
   public Reservation reservation;
   /** @pdRoleInfo migr=no name=Review assc=association3 mult=1 type=Composition */
   public Review review;

}