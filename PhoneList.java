/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.phonelist;

public class PhoneList {

    public static void main(String[] args) {
       PhoneList s = new PhoneList();
       s.addContact("Abdo", "01221174146");
       s.addContact("Ahmed", "01201163609");
       s.addContact("hany", "01201163666");
       s.deleteContact("Ahmed");
       s.displayList();
    }
    c
    
//    class ContactNode{
//        
//        String Name ;
//        String phone_Number ;
//       ContactNode next ;
//       
//       ContactNode(){
//           Name = null ;
//           phone_Number = null;
//           next = null ;
//       }
//       ContactNode(String name , String phone_number ){
//           this.Name = name ;
//           this.phone_Number = phone_number ;
//           next = null ;
//       }
//       
//       ContactNode(String name , String phone_number ,ContactNode n  ){
//           this.Name = name ;
//           this.phone_Number = phone_number ;
//           next = n ;
//       }
//    }
//    
//    ContactNode head ;
//    ContactNode tail ;
//    PhoneList(){
//        head = tail = null ;
//    }
//    
//    public void addContact(String name , String phone_num){
//        if(head == null){
//            head =tail= new ContactNode(name , phone_num);
//            System.out.printf("\" Contact added : %s , %s \"",head.Name , head.phone_Number);
//            System.out.println(""); 
//        }
//        else{
//            ContactNode temp = head ;
//            while(temp!=null){
//                if(temp.next == null){
//                    temp.next = new ContactNode(name , phone_num);
//                    System.out.printf( "\" Contact added : %s , %s \"" ,temp.next.Name,temp.next.phone_Number);
//                    System.out.println("");
//                    break;
//                }
//                temp = temp.next ;
//            }
//        }
//        
//    }
//   public void displayList(){
//       if(head == null)
//           System.out.println("Phone list is empty.");
//       else{
//       ContactNode temp = head ;
//       while(temp!=null){
//           System.out.printf("Name : %s , Phone : %s",temp.Name , temp.phone_Number);
//           System.out.println("");
//           temp = temp.next ;
//       }
//    }
//  }
//   
// public void searchContact(String name){
//     if(head == null)
//         System.out.println("Phone list is empty.");
//     else{
//         int c = 0 ;
//         ContactNode temp = head ;
//         while(temp != null){
//             if(temp.Name == name){
//                 System.out.printf("Contact found : Name : %s , Phone : %s",temp.Name , temp.phone_Number);
//                 System.out.println("");
//                 c+=1;
//                 break ;
//             }
//             temp = temp.next ;
//         }
//         if(c ==0){
//             System.out.printf("Contact with name '%s' not found.",temp.Name);
//             System.out.println("");
//         }
//     }
// }
// 
// public void deleteContact(String name){
//     if(head == null){
//         System.out.println("Phone list is empty.");
//     }
//     else{
// 
//      if(head.Name == name){
//          System.out.printf("Contact with name '%s' not found.", head.Name);
//          head = head.next ;
//          }
//      else{
//          ContactNode temp = head ;
//          while(temp!=null){
//              if(temp.next.Name== name){
//                  System.out.printf("Deleting contact: %s ",temp.Name);
//                  System.out.println("");
//                  temp.next = temp.next.next ;
//                  break;
//              }
//              temp = temp.next ;
//          }
//      }
//   }
// }

//}