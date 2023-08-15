/**
 * Project name:Booking Movie Tickets
 * By:Suhas.S
 * Class:10 
 */
import java.io.*;
public class Booking_movietickets
{
 public static void main(String args[])throws Exception
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String title="******************WELCOME TO HAL CINEMA*****************";
  String list[]=new String[19];//for Storing Movie names.
  list[0]="DANGAL";list[1]="FAST AND FURIOUS 8";list[2]="A CHRISTMAS CAROL";list[3]="NOOR";list[4]="SMURFS";list[5]="NAAM SHABANA";
  list[6]="BAHUBALI 2";list[7]="RAAJAKUMARA";list[8]="SIVALINGA";list[9]="CHAKRAVARTI";list[10]="BEAUTY AND THE BEAST";list[11]="TAMIL 24";
  list[12]="RAKSHADHIKARI BAIJU";list[13]="ALL THE BEST";list[14]="KATAMARAYADU";list[15]="JULIE AND JULIA";list[16]="CHOWKA";
  list[17]="GURU";list[18]="RAGA";
  String city[]=new String[6];//for Storing City names.
  city[0]="BANGALORE";city[1]="CHANDIGARH";city[2]="DELHI";city[3]="HYDERABAD";city[4]="MUMBAI";city[5]="KOLKATA";
  String cityN,movie,size;//declaration of String variables
  String ans="Q";String ans1="Q";
  int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,catg,quantity,date,fd;
  int tot_fd=1,tot_d,d,ch;//declaration of Integer variables
  do
  {
   System.out.println();   
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println();
   System.out.println("<<< SELECT YOUR CURRENT CITY >>>");
   
   do
   {
    if(flag>0)
    System.out.println("** INVALID INPUT ! TRY AGAIN **");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** BANGALORE CHANDIGARH DELHI HYDERABAD MUMBAI KOLKATA **");
    System.out.println();
    System.out.print("ENTER THE CORRECT CITY NAME FOR YOUR CHOICE :");
    cityN=br.readLine();
    for(int i=0;i<6;i++)
    {
     if(city[i].equalsIgnoreCase(cityN))
     {
      flag=0;
      break;
     }
     else
     flag++;
    }
   }while(flag!=0);
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println("<<< SELECT YOUR CATAGORY TO WATCH THE MOVIE >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1.HAL "+cityN+" CLASSIC CINEMAS **");
    System.out.println("** 2.HAL "+cityN+" SUPER CLASSIC CINEMAS **");
    System.out.println();
    System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
    catg=Integer.parseInt(br.readLine());
    if((catg==1)||(catg==2))
      flag1=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag1++;
    }
   }while(flag1!=0);
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println();
   System.out.println("<<< INFORMATION >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("  ! MOBILE AND INTERNET BOOKING IS ALSO AVAILABLE !");
   System.out.println("FOR MOBILE BOOKING CONTACT==411288598 FROM YOUR MOBILE");
   System.out.println("            ** PREMIUM RATES AAPLY **");
   System.out.println("FOR INTERNATE BOOKING VISIT: http://www.halcinemas.com");
   System.out.println();
   System.out.println("** CATCH THE LATEST MOVIES AT HAL CINEMAS NEAR YOU **");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println();
   System.out.println("<<< SELECT YOUR DATE FOR THE MOVIE >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1. THURSDAY, 26 APRIL [2017] **");
    System.out.println("** 2. FRIDAY,   27 APRIL [2017] **");
    System.out.println("** 3. SATURDAY, 28 APRIL [2017] **");
    System.out.println("** 4. SUNDAY,   29 APRIL [2017] **");
    System.out.println("** 5. MONDAY,   30 APRIL [2017] **");
    System.out.println("** 6. TUESDAY,  01 MAY [2017] **");
    System.out.println("** 7. WEDNESDAY,02 MAY [2017] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   System.out.println("<<< PLEASE ENTER THE NUMBER OF TICKTETS >>>");
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.print("ENTER THE NUMBER OF TICKTETS :");
   quantity=Integer.parseInt(br.readLine());
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("\f");//to clear the screen for next window
   System.out.println(title);
   System.out.println("*********************************************************");
   if(catg==1)
   {
    System.out.println("<<< MOVIE SELECTION >>>");
    do
    {
     if(flag3>0)
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     System.out.println("************************** NOW SHOWING ***************************");
     System.out.println("MOVIE NAME                   RATING      LANGUAGE    SHOW TIMINGS");
     System.out.println();
     System.out.println("DANGAL                        A          HINDI       01:00pm,9:15pm");
     System.out.println("FAST AND FURIOUS 8            U/A        ENGLISH     06:15pm");
     System.out.println("A CHRISTMAS CAROL             U          ENGLISH     03:20pm");
     System.out.println("NOOR                          U/A        HINDI       06:15pm,9:20pm");
     System.out.println("SMURFS                        U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
     System.out.println("NAAM SHABANA                  U          HINDI       10:30am,12:45pm,1:05pm");
     System.out.println("BAHUBALI 2                    U          TELUGU      12:15pm,9:45pm");
     System.out.println("RAAJAKUMARA                   U          KANNADA      10:00am,12:15pm");
     System.out.println("SIVALINGA                     U          TAMIL       01:00pm,4:05pm");
     System.out.println("CHAKRAVARTI                   U          KANNADA     01:20pm");
     System.out.println("BEAUTY AND THE BEAST          U          ENGLISH      01:20pm");
     System.out.println("TAMIL 24                      U          TAMIL       06:15pm");
     System.out.println("RAKSHADHIKARI BAIJU           U/A        MALAYALAM   11:00am");
     System.out.println("ALL THE BEST                  U          HINDI       03:40pm");
     System.out.println("KATAMARAYADU                  U          TELUGU      01:20pm");
     System.out.println("JULIE AND JULIA               U          HINDI       10:00 am");
     System.out.println("CHOWKA                        U          KANNADA     04:00 pm");
     System.out.println("GURU                          U          TELUGU      03:20pm");
     System.out.println("RAGA                          U/A        KANNADA     09:00pm");
     System.out.println();
     System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
     movie=br.readLine();
     for(int i=0;i<19;i++)
     {
      if(list[i].equalsIgnoreCase(movie))
       {
        flag3=0;   
        break;
       }
      else
       flag3++;
     }
    }while(flag3!=0);
    System.out.println();
    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Movie Selected :"+movie);
    System.out.println("The Total Cost is Rs. "+(quantity*110));
    System.out.print("Your Seat Number/s is/ are ");
    for(int i=1;i<=quantity;i++)
    {
     System.out.print(17+i+" ");
    }
    System.out.println();
   }
   if(catg==2)
   {
     System.out.println("<<< MOVIE SELECTION >>>");
    do
    {
     if(flag3>0)
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     System.out.println("************************** NOW SHOWING ***************************");
     System.out.println("MOVIE NAME                   RATING      LANGUAGE    SHOW TIMINGS");
     System.out.println();
     System.out.println("DANGAL                        A          HINDI       01:00pm,9:15pm");
     System.out.println("FAST AND FURIOUS 8            U/A        ENGLISH     06:15pm");
     System.out.println("A CHRISTMAS CAROL             U          ENGLISH     03:20pm");
     System.out.println("NOOR                          U/A        HINDI       06:15pm,9:20pm");
     System.out.println("SMURFS                        U/A        ENGLISH     12:45pm,1:05pm,3:20pm,9:05pm");
     System.out.println("NAAM SHABANA                  U          HINDI       10:30am,12:45pm,1:05pm");
     System.out.println("BAHUBALI 2                    U          TELUGU      12:15pm,9:45pm");
     System.out.println("RAAJAKUMARA                   U          KANNADA      10:00am,12:15pm");
     System.out.println("SIVALINGA                     U          TAMIL       01:00pm,4:05pm");
     System.out.println("CHAKRAVARTI                   U          KANNADA     01:20pm");
     System.out.println("BEAUTY AND THE BEAST          U          ENGLISH      01:20pm");
     System.out.println("TAMIL 24                      U          TAMIL       06:15pm");
     System.out.println("RAKSHADHIKARI BAIJU           U/A        MALAYALAM   11:00am");
     System.out.println("ALL THE BEST                  U          HINDI       03:40pm");
     System.out.println("KATAMARAYADU                  U          TELUGU      01:20pm");
     System.out.println("JULIE AND JULIA               U          HINDI       10:00 am");
     System.out.println("CHOWKA                        U          KANNADA     04:00 pm");
     System.out.println("GURU                          U          TELUGU      03:20pm");
     System.out.println("RAGA                          U/A        KANNADA     09:00pm");
     System.out.println();
     System.out.println();
     System.out.print("ENTER THE NAME OF YOUR SELECTED MOVIE :");
     movie=br.readLine();
     for(int i=0;i<19;i++)
     {
      if((i==2)||(i==9)||(i==12)||(i==16))
       i++;
      if(list[i].equalsIgnoreCase(movie))
       {
        flag3=0;
        break;
       }
      else
       flag3++;
     }
    }while(flag3!=0);
    System.out.println();
    System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Movie Selected :"+movie);
    System.out.println("The Total Cost is Rs. "+(quantity*200));
    System.out.print("Your Seat Number/s is/ are ");
    for(int i=1;i<=quantity;i++)
    {
     System.out.print(135+i+" ");
    }
    System.out.println();
   }
   System.out.println("*********************************************************");
   System.out.println("************ THANK YOU FOR BUYING TICKETS ***************");
   System.out.println("************   HAVE A GREAT DAY     *********************");
   System.out.println("********************************************************");
   System.out.println("TO QUIT BUYING TICKETS ENTER 'Q'");
   ans=br.readLine();
  
  System.out.println("\f");//to clear the screen for next window
  System.out.println(title);

  System.out.println("*********************************************************");
  System.out.println();
  System.out.println("<<< CANCELLATION OF TICKETS >>>");
  do
  {
   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
   System.out.println("1. TO CANCEL TICKET");
   System.out.println("2. TO SKIP PROCESS");
   System.out.print("ENTER YOUR CHOICE NUMBER :");
   ch=Integer.parseInt(br.readLine());
   if(ch==1)
   {
    System.out.println("YOU HAVE CHOOSEN TO CANCEL THE TICKETS");
    flag4=0;
    cancel();
   }
   else if(ch==2)
   {
    System.out.println("** YOU HAVE CHOOSEN NOT TO CANCEL THE TICKETS **");
    System.out.println("               ** THANK YOU **");
    flag4=0;
   }
   else
    {
     System.out.println(" ### INVALID CHOICE ###");
     flag4++;
    }
  }while(flag4!=0);
 }while(ans1.equalsIgnoreCase("Q")!=true);
}

public static void cancel() throws Exception
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
 int date,catg,quantity,seat_no,flag1=0,flag2=0;
 String movie,shw_time;
 System.out.println("*** TODAYS DATE: 8,MAY[FRIDAY] 2017");
 System.out.println("*** TIME: 5:00pm");
 System.out.println("**************************************************************");
 System.out.println("YOU CANNOT CANCEL YOUR TICKETS FOR ANY SHOW BEFORE THIS TIMING");
 System.out.println("<<< SELECT YOUR CATEGORY TO CANCEL TICKETS >>>");
 do
 {
  System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  System.out.println("** 1.HAL CLASSIC CINEMAS **");
  System.out.println("** 2.HAL SUPER CLASSIC CINEMAS **");
  System.out.println();
  System.out.print("ENTER THE CORRECT CATEGORY NUMBER FOR YOUR CHOICE :");
  catg=Integer.parseInt(br.readLine());
  if((catg==1)||(catg==2))
   flag1=0;
  else
  {
   System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
   flag1++;
  }
 }while(flag1!=0);
 System.out.println("\f");//to clear the screen for next window
 switch(catg)
 {
  case 1:
  System.out.println("***************** HAL CLASSIC CINEMAS *********************");
   System.out.println();
   System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1. THURSDAY, 26 APRIL [2017] **");
    System.out.println("** 2. FRIDAY,   27 APRIL [2017] **");
    System.out.println("** 3. SATURDAY, 28 APRIL [2017] **");
    System.out.println("** 4. SUNDAY,   29 APRIL [2017] **");
    System.out.println("** 5. MONDAY,   30 APRIL [2017] **");
    System.out.println("** 6. TUESDAY,  01 MAY [2017] **");
    System.out.println("** 7. WEDNESDAY,02 MAY [2017] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
  System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU WOULD LIKE TO CANCEL");
  movie=br.readLine();
  System.out.println("PLEASE ENTER THE SHOW TIMINGS");
  shw_time=br.readLine();
  System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
  quantity=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE SEAT NUMBER");
  seat_no=Integer.parseInt(br.readLine());
  System.out.println();
  System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
  break;
  
  case 2:
  System.out.println("**************** HAL SUPER CLASSIC CINEMAS *****************");
  System.out.println();
  System.out.println("<<< SELECT YOUR DATE FOR CANCELLATION >>>");
   do
   {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("** 1. THURSDAY, 26 APRIL [2017] **");
    System.out.println("** 2. FRIDAY,   27 APRIL [2017] **");
    System.out.println("** 3. SATURDAY, 28 APRIL [2017] **");
    System.out.println("** 4. SUNDAY,   29 APRIL [2017] **");
    System.out.println("** 5. MONDAY,   30 APRIL [2017] **");
    System.out.println("** 6. TUESDAY,  01 MAY [2017] **");
    System.out.println("** 7. WEDNESDAY,02 MAY [2017] **");
    System.out.println();
    System.out.print("ENTER THE CORRECT NUMBER FOR YOUR SELECTED DATE :");
    date=Integer.parseInt(br.readLine());
    if((date>=1)&&(date<=7))
     flag2=0;
    else
    {
     System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
     flag2++;
    }
   }while(flag2!=0);
  date=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE NAME OF THE MOVIE YOU LIKE TO CANCEL");
  movie=br.readLine();
  System.out.println("PLEASE ENTER THE SHOW TIMINGS");
  shw_time=br.readLine();
  System.out.println("PLEASE ENTER THE QUANTITY OF TICKETS");
  quantity=Integer.parseInt(br.readLine());
  System.out.println("PLEASE ENTER THE SEAT NUMBER");
  seat_no=Integer.parseInt(br.readLine());
  System.out.println();
  System.out.println("YOUR TICKETS HAVE BEEN SUCCESSFULLY CANCELLED");
  break;
}
}
}
