package victoria.mtn_mobile_money;

import java.util.Scanner;


public class Mtn_mobile_money { 

    // Helper method for PIN verification
    private static boolean verifyPin(Scanner input, int correctPin) {
        System.out.println("Input your PIN to complete the transaction");
        int enteredPin = input.nextInt();
        input.nextLine(); // Consume the newline character
        if (enteredPin == correctPin) {
            return true;
        } else {
            System.out.println("Wrong PIN. Try again:");
            enteredPin = input.nextInt();
            input.nextLine(); // Consume the newline character
            if (enteredPin == correctPin) {
                return true;
            } else {
                System.out.println("Wrong PIN again. Transaction Cancelled.");
                return false;
            }
        }
    }

    // Helper method for phone number validation
    private static boolean isValidPhoneNumber(String phone) {
        return phone.length() == 10 && phone.matches("\\d+"); // Checks for 10 digits
    }

    // Helper method for bank account validation
    private static boolean isValidBankAccount(String account) {
        return account.length() >= 10 && account.length() <= 12 && account.matches("\\d+");
    }

    // Helper method for generating a random 20 digit token
    private static String generateToken() {
        String token = "";
        for (int i = 0; i < 20; i++) {
            token += (int) (Math.random() * 10);
        }
        return token;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int pin = 12345; // I have set a default pin for testing
        String mobile = "0747701160";
        while (true) {
        System.out.println("Welcome to MOMO");
        System.out.println("===========MOMO==============");
        System.out.println("Select the Best option \n1: Send Money \n2: Airtime/Bundles \n3: Withdraw Money \n4: Pay Bills \n5: Make Payments \n0: Exit");
        int option = input.nextInt();
        input.nextLine(); // Consume the newline character after reading int
        
        switch(option){
            case 1:
                System.out.println("Send money");
                System.out.println("Select the Best Option\n1: To Airtel Number \n2: To MTN \n3: To bank account");
                int option2 = input.nextInt();
                
                switch(option2){
                    case 1:
                        System.out.println("To Airtel Number");
                        System.out.println("Input phone No.");
                        String phone = input.next(); // Use String to keep leading zeros
                        
                        if(phone.length() == 10){
                            System.out.println("You have entered: " + phone);
                            System.out.println("Enter amount to send");
                            double amount = input.nextDouble();
                            System.out.println("You have entered: " + amount);
                            System.out.println("Processing.................");
                            System.out.println("Input your PIN to complete the transaction");
                            if (input.nextInt() == pin) {
                                System.out.println("Transaction Successful");
                                System.out.println("You have successfully sent " + amount + " to " + phone);
                            } else {
                                System.out.println("Wrong PIN. Try again:");
                                if (input.nextInt() == pin) {
                                    System.out.println("Transaction Successful");
                                    System.out.println("You have successfully sent " + amount + " to " + phone);
                                } else {
                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                }
                            }
                        } else {
                            System.out.println("Invalid Phone Number (Must be 10 digits)");
                        }
                        break; 
                    case 2:
                        System.out.println("To MTN");
                        System.out.println("Input phone No.");
                        String phone2 = input.next();
                        if(phone2.length() == 10){
                            System.out.println("You have entered: " + phone2);
                            System.out.println("Enter amount to send");
                            double amount2 = input.nextDouble();
                            System.out.println("You have entered: " + amount2);
                            System.out.println("Processing.................");
                            System.out.println("Input your PIN to complete the transaction");
                            if (input.nextInt() == pin) {
                                System.out.println("Transaction Successful");
                                System.out.println("You have successfully sent " + amount2 + " to " + phone2);
                            } else {
                                System.out.println("Wrong PIN. Try again:");
                                if (input.nextInt() == pin) {
                                    System.out.println("Transaction Successful");
                                    System.out.println("You have successfully sent " + amount2 + " to " + phone2);
                                } else {
                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                }
                            }
                        } else {
                            System.out.println("Invalid Phone Number (Must be 10 digits)");
                        }
                        break;
                        
                    case 3:
                        System.out.println("To bank account");
                        System.out.println("Input bank account No.");
                        String account = input.next();
                        if(account.length() >= 10 && account.length() <= 12){
                            System.out.println("You have entered: " + account);
                            System.out.println("Enter amount to send");
                            double amount3 = input.nextDouble();
                            System.out.println("You have entered: " + amount3);
                            System.out.println("Processing.................");
                            System.out.println("Input your PIN to complete the transaction");
                            if (input.nextInt() == pin) {
                                System.out.println("Transaction Successful");
                                System.out.println("You have successfully sent " + amount3 + " to account " + account);
                            } else {
                                System.out.println("Wrong PIN. Try again:");
                                if (input.nextInt() == pin) {
                                    System.out.println("Transaction Successful");
                                    System.out.println("You have successfully sent " + amount3 + " to account " + account);
                                } else {
                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                }
                            }
                        } else {
                            System.out.println("Invalid Bank Account Number (Must be between 10 and 12 digits)");
                        }
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
                break;

            case 2:
                System.out.println("Airtime/Bundles");
                System.out.println("Select the Best Option\n1: Airtime \n2: Voice Bundles \n3:Internet Bundles \n4: Special Bundles \n5: Buy Airtime Stock \n6: Music & Video \n0: Back");
                int option3 = input.nextInt();
                switch(option3){
                    case 1:
                        System.out.println("Airtime");
                        System.out.println("Select\n1: Buy for self \n2: Buy for others \n3: Other Networks");
                        int option4 = input.nextInt();
                        switch(option4){
                            case 1:
                                System.out.println("Buy for self");
                                System.out.println("Enter amount");
                                double amount4 = input.nextDouble();
                                System.out.println("You have entered: " + amount4);
                                System.out.println("Processing.................");
                                System.out.println("Input your PIN to complete the transaction");
                                if (input.nextInt() == pin) {
                                    System.out.println("Transaction Successful");
                                    System.out.println("You have successfully bought " + amount4 + " airtime for yourself");
                                } else {
                                    System.out.println("Wrong PIN. Try again:");
                                    if (input.nextInt() == pin) {
                                        System.out.println("Transaction Successful");
                                        System.out.println("You have successfully bought " + amount4 + " airtime for yourself");
                                    } else {
                                        System.out.println("Wrong PIN again. Transaction Cancelled.");
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Buy for others");
                                System.out.println("Input phone No.");
                                String phone3 = input.next();
                                if(phone3.length() == 10){
                                    System.out.println("You have entered: " + phone3);
                                    System.out.println("Enter amount");
                                    double amount5 = input.nextDouble();
                                    System.out.println("You have entered: " + amount5);
                                    System.out.println("Processing.................");
                                    System.out.println("Input your PIN to complete the transaction");
                                    if (input.nextInt() == pin) {
                                        System.out.println("Transaction Successful");
                                        System.out.println("You have successfully bought " + amount5 + " airtime for " + phone3);
                                    } else {
                                        System.out.println("Wrong PIN. Try again:");
                                        if (input.nextInt() == pin) {
                                            System.out.println("Transaction Successful");
                                            System.out.println("You have successfully bought " + amount5 + " airtime for " + phone3);
                                        } else {
                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                        }
                                    }
                                } else {
                                    System.out.println("Invalid Phone Number (Must be 10 digits)");
                                }
                                break;

                            case 3:
                                System.out.println("Other Networks");
                                System.out.println("Select Network\n1: Airtel \n2: Lycamobile");
                                int option5 = input.nextInt();
                                switch(option5){
                                    case 1:
                                        System.out.println("Airtel");
                                        System.out.println("Input phone No.");
                                        String phone4 = input.next();
                                        if(phone4.length() == 10){
                                            System.out.println("You have entered: " + phone4);
                                            System.out.println("Enter amount");
                                            double amount6 = input.nextDouble();
                                            System.out.println("You have entered: " + amount6);
                                            System.out.println("Processing.................");
                                            System.out.println("Input your PIN to complete the transaction");
                                            if (input.nextInt() == pin) {
                                                System.out.println("Transaction Successful");
                                                System.out.println("You have successfully bought " + amount6 + " airtime for " + phone4);
                                            } else {
                                                System.out.println("Wrong PIN. Try again:");
                                                if (input.nextInt() == pin) {
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought " + amount6 + " airtime for " + phone4);
                                                } else {
                                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                }
                                            }
                                        } else {
                                            System.out.println("Invalid Phone Number (Must be 10 digits)");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Lycamobile");
                                        System.out.println("Input phone No.");
                                        String phone5 = input.next();
                                        if(phone5.length() == 10){
                                            System.out.println("You have entered: " + phone5);
                                            System.out.println("Enter amount");
                                            double amount7 = input.nextDouble();
                                            System.out.println("You have entered: " + amount7);
                                            System.out.println("Processing.................");
                                            System.out.println("Input your PIN to complete the transaction");
                                            if (input.nextInt() == pin) {
                                                System.out.println("Transaction Successful");
                                                System.out.println("You have successfully bought " + amount7 + " airtime for " + phone5);
                                            } else {
                                                System.out.println("Wrong PIN. Try again:");
                                                if (input.nextInt() == pin) {
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought " + amount7 + " airtime for " + phone5);
                                                } else {
                                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                }
                                            }
                                        } else {
                                            System.out.println("Invalid Phone Number (Must be 10 digits)");
                                        }
                                        break;

                                    default:
                                        System.out.println("Invalid Option");
                                }
                                break;
                            default:
                                System.out.println("Invalid Option");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Voice Bundles");
                        System.out.println("Select\n1: My number \n2: Other number");
                        int option6 = input.nextInt();
                        switch(option6){
                            case 1:
                                System.out.println("My number");
                                System.out.println("Select Bundle\n1: Daily \n2: Super Voice Bundles \n3: Freedom");
                                int option7 = input.nextInt();
                                switch(option7){
                                    case 1:
                                        System.out.println("Daily");
                                        System.out.println("Select Bundle\n1: 70mins + 5mbs + 5sms @ 1000 \n2: 20mins +5mbs + 5sms @ 550 \n3: 70mins @ 2000 (All Networks) \n4: 40mins @ 1000 (All Networks) \n5: 15mins @ 750");
                                        int option8 = input.nextInt();
                                        switch(option8){
                                            case 1:
                                                System.out.println("Daily");
                                                System.out.println("70mins + 5mbs + 5sms @ 1000");
                                                System.out.println("you're about to buy 70mins + 5mbs + 5sms @ 1000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 70mins + 5mbs + 5sms @ 1000 for " + mobile);
                                                }
                                                break;
                                            case 2:
                                                System.out.println("20mins +5mbs + 5sms @ 550");
                                                System.out.println("you're about to buy 20mins + 5mbs + 5sms @ 550 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 20mins + 5mbs + 5sms @ 550 for " + mobile);
                                                }
                                                break;

                                            case 3:
                                                System.out.println("70mins @ 2000 (All Networks)");
                                                System.out.println("you're about to buy 70mins @ 2000 (All Networks) for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 70mins @ 2000 (All Networks) for " + mobile);
                                                }
                                                break;
                                        }
                                        break;
                                        
                                    case 2:
                                        System.out.println("Super Voice Bundles");
                                        System.out.println("Select Bundle\n1: 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 \n2: 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 \n3: 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000");
                                        int option9 = input.nextInt();
                                        switch(option9){
                                            case 1:
                                                System.out.println("50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000");
                                                System.out.println("you're about to buy 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 for " + mobile);
                                                }
                                                break;
                                            case 2:
                                                System.out.println("500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000");
                                                System.out.println("you're about to buy 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 for " + mobile);
                                                }
                                                break;

                                            case 3:
                                                System.out.println("1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000");
                                                System.out.println("you're about to buy 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000 for " + mobile);
                                                }
                                        break;
                                            }
                                            break;

                                    case 3:
                                        System.out.println("Freedom");
                                        System.out.println("Select Bundle\n1: 90min @ 5000 All Networks \n2:200min @ 10000 \n3: 1300min @ 30000 \n4: 2500min @ 50000");
                                        int option10 = input.nextInt();
                                        switch(option10){
                                            case 1:
                                                System.out.println("90min @ 5000 All Networks");
                                                System.out.println("you're about to buy 90min @ 5000 All Networks for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 90min @ 5000 All Networks for " + mobile);
                                                }
                                                break;
                                            case 2:
                                                System.out.println("200min @ 10000");
                                                System.out.println("you're about to buy 200min @ 10000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 200min @ 10000 for " + mobile);
                                                }
                                                break;
                                            case 3:
                                                System.out.println("1300min @ 30000");
                                                System.out.println("you're about to buy 1300min @ 30000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 1300min @ 30000 for " + mobile);
                                                }
                                                break;
                                            case 4:
                                                System.out.println("2500min @ 50000");
                                                System.out.println("you're about to buy 2500min @ 50000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 2500min @ 50000 for " + mobile);
                                                }   
                                        break;
                                            }
                                            break;
                                    default:
                                        System.out.println("Invalid Option");
                                }
                                break;
                            case 2:
                                System.out.println("Other number");
                                System.out.println("Input phone No.");
                                String phone6 = input.next();
                                if(phone6.length() == 10){
                                    System.out.println("You have entered: " + phone6);
                                    System.out.println("Select Bundle\n1: Daily \n2: Super Voice Bundles \n3: Freedom");
                                    int option11 = input.nextInt();
                                    switch(option11){
                                        case 1:
                                            System.out.println("Daily");
                                            System.out.println("Select Bundle\n1: 70mins + 5mbs + 5sms @ 1000 \n2: 20mins +5mbs + 5sms @ 550 \n3: 70mins @ 2000 (All Networks) \n4: 40mins @ 1000 (All Networks) \n5: 15mins @ 750");
                                            int option12 = input.nextInt();
                                            switch(option12){
                                                case 1:
                                                    System.out.println("Daily");
                                                    System.out.println("70mins + 5mbs + 5sms @ 1000");
                                                    System.out.println("you're about to buy 70mins + 5mbs + 5sms @ 1000 for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 70mins + 5mbs + 5sms @ 1000 for " + phone6);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("20mins +5mbs + 5sms @ 550");
                                                    System.out.println("you're about to buy 20mins + 5mbs + 5sms @ 550 for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 20mins + 5mbs + 5sms @ 550 for " + phone6);
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.println("70mins @ 2000 (All Networks)");
                                                    System.out.println("you're about to buy 70mins @ 2000 (All Networks) for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 70mins @ 2000 (All Networks) for " + phone6);
                                                    }
                                break;
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Super Voice Bundles");
                                            System.out.println("Select Bundle\n1: 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 \n2: 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 \n3: 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000");
                                            int option13 = input.nextInt();
                                            switch(option13){
                                                case 1:
                                                    System.out.println("50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000");
                                                    System.out.println("you're about to buy 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 50 MTN-MTN min +20 All networks min + 1GB for 7 days @ 5000 for " + phone6);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000");
                                                    System.out.println("you're about to buy 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 500 MTN-MTN + 100 All network mins + 5GB for 30 days @ 25000 for " + phone6);
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.println("1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000");
                                                    System.out.println("you're about to buy 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000 for " + phone6);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if(input.nextInt() == pin){
                                                        System.out.println("Transaction Successful");
                                                        System.out.println("You have successfully bought 1000 MTN-MTN mins + 200 All network mins + 20GB, no expiry @ 70000 for " + phone6);
                                                    } else {
                                                        System.out.println("Wrong PIN. Try again:");
                                                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Invalid Option");
                                            }
                                            break;
                                    }
                                }
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("Internet Bundles");
                        System.out.println("Select Bundle\n1: My Number \n2: Other Number");
                        int option14 = input.nextInt();
                        switch(option14){
                            case 1:
                                System.out.println("My Number");
                                System.out.println("Select Bundle\n1: Daily \n2: Gaga time");
                                int option15 = input.nextInt();
                                switch(option15){
                                    case 1:
                                        System.out.println("Daily");
                                        System.out.println("Select Bundle\n1: 100MB for 1 day @ 500 \n2: 200MB for 1 day @ 1000 \n3: 500MB for 1 day @ 2000");
                                        int option16a = input.nextInt();
                                        switch(option16a){
                                            case 1:
                                                System.out.println("100MB for 1 day @ 500");
                                                System.out.println("you're about to buy 100MB for 1 day @ 500 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 100MB for 1 day @ 500 for " + mobile);
                                                } else {
                                                    System.out.println("Wrong PIN. Try again:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful");
                                                    } else {
                                                        System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                    }
                                                }
                                                break;
                                            case 2:
                                                System.out.println("200MB for 1 day @ 1000");
                                                System.out.println("you're about to buy 200MB for 1 day @ 1000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 200MB for 1 day @ 1000 for " + mobile);
                                                } else {
                                                    System.out.println("Wrong PIN. Try again:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful");
                                                    } else {
                                                        System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                    }
                                                }
                                                break;
                                            case 3:
                                                System.out.println("500MB for 1 day @ 2000");
                                                System.out.println("you're about to buy 500MB for 1 day @ 2000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 500MB for 1 day @ 2000 for " + mobile);
                                                } else {
                                                    System.out.println("Wrong PIN. Try again:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful");
                                                    } else {
                                                        System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                    }
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid Option");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Gaga time");
                                        System.out.println("Select Bundle\n1: Buy 2GB for 2000(12am-10am) \n2: Buy 5GB for 5000(12am-10am) \n3: Buy 10GB for 10000(12am-10am)");
                                        int option16b = input.nextInt();
                                        switch(option16b){
                                            case 1:
                                                System.out.println("You're about to buy 2GB for 2000(12am-10am) for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 2GB for 2000(12am-10am) for " + mobile);
                                                } else {
                                                    System.out.println("Wrong PIN. Try again:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful");
                                                    } else {
                                                        System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                    }
                                                }
                                                break;
                                            case 2:
                                                System.out.println("You're about to buy 5GB for 5000(12am-10am) for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 5GB for 5000(12am-10am) for " + mobile);
                                                }
                                                break;
                                            case 3:
                                                System.out.println("You're about to buy 10GB for 10000(12am-10am) for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if(input.nextInt() == pin){
                                                    System.out.println("Transaction Successful");
                                                    System.out.println("You have successfully bought 10GB for 10000(12am-10am) for " + mobile);
                                                }
                                                break;
                                                
                                            default:
                                                System.out.println("Invalid Option");
                                        }
                                        break;
                                }
                                break;

                                    case 2:
                                        System.out.println("Other Number");
                                        System.out.println("Input phone No.");
                                        String phone7 = input.next();
                                        if(phone7.length() == 10){
                                            System.out.println("You have entered: " + phone7);
                                            System.out.println("Select Bundle\n1: Daily \n2: Gaga time");
                                            int option17 = input.nextInt();
                                            switch(option17){
                                                case 1:
                                                    System.out.println("Daily");
                                                    System.out.println("Select Bundle\n1: 100MB for 1 day @ 500 \n2: 200MB for 1 day @ 1000 \n3: 500MB for 1 day @ 2000");
                                                    int option18 = input.nextInt();
                                                    switch(option18){
                                                        case 1:
                                                            System.out.println("100MB for 1 day @ 500");
                                                            System.out.println("you're about to buy 100MB for 1 day @ 500 for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 100MB for 1 day @ 500 for " + phone7);
                                                            }
                                                            break;  
                                                        case 2:
                                                            System.out.println("3GB for 3hrs @ 3000(Boosta)");
                                                            System.out.println("you're about to buy 3GB for 3hrs @ 3000(Boosta) for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 3GB for 3hrs @ 3000(Boosta) for " + phone7);
                                                            }
                                                            break;
                                                        case 3:
                                                            System.out.println("3GB @ 2000(12am-6am)");
                                                            System.out.println("you're about to buy 3GB @ 2000(12am-6am) for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 3GB @ 2000(12am-6am) for " + phone7);
                                                            }
                                                            break;
                                                        default:
                                                            System.out.println("Invalid Option");
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("Gaga time");
                                                    System.out.println("Select Bundle\n1: Buy 2GB for 2000(12am-10am) \n2: Buy 5GB for 5000(12am-10am) \n3: Buy 10GB for 10000(12am-10am)");
                                                    int option19 = input.nextInt();
                                                    switch(option19){
                                                        case 1:
                                                            System.out.println("You're about to buy 2GB for 2000(12am-10am) for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 2GB for 2000(12am-10am) for " + phone7);
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("You're about to buy 5GB for 5000(12am-10am) for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 5GB for 5000(12am-10am) for " + phone7);
                                                            }
                        break;
                                                        case 3:
                                                            System.out.println("You're about to buy 10GB for 10000(12am-10am) for " + phone7);
                                                            System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought 10GB for 10000(12am-10am) for " + phone7);
                                                            }
                        break;
                                                        default:
                                                            System.out.println("Invalid Option");
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                                break;
                    case 4:
                        System.out.println("Special Bundles");
                        System.out.println("Select Option\n1:My Number \n2:Other Number");
                        int option20 = input.nextInt();
                        switch(option20){
                            case 1:
                                System.out.println("My Number");
                                System.out.println("Select Bundle\n1: Kazi Bundle");
                                int option21 = input.nextInt();
                                switch(option21){
                                    case 1:
                                        System.out.println("Kazi Bundle");
                                        System.out.println("Select Bundle\n1: Buy Small for 100000 \n2: Buy Medium for 150000 \n3: Buy Large for 250000");
                                        int option22 = input.nextInt();
                                        switch(option22){
                                            case 1:
                                                System.out.println("Buy Small for 100000");
                                                System.out.println("you're about to buy Small for 100000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                            if(input.nextInt() == pin){
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought Small for 100000 for " + mobile);
                                                            } else {
                                                                System.out.println("Wrong PIN. Try again:");
                                                                if (input.nextInt() == pin) {
                                                                    System.out.println("Transaction Successful");
                                                                } else {
                                                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                                }
                                                            }
                                                break;

                                            case 2:
                                                System.out.println("Buy Medium for 150000");
                                                System.out.println("you're about to buy Medium for 150000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if (input.nextInt() == pin) {
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought medium for 150000 for " + mobile);
                                                            } else {
                                                                System.out.println("Wrong PIN. Try again:");
                                                                if (input.nextInt() == pin) {
                                                                    System.out.println("Transaction Successful");
                                                                } else {
                                                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                                }
                                                            }
                                                break;

                                            case 3:
                                                System.out.println("Buy Large for 250000");
                                                System.out.println("you're about to buy Large for 250000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if (input.nextInt() == pin) {
                                                                System.out.println("Transaction Successful");
                                                                System.out.println("You have successfully bought large for 250000 " + mobile);
                                                            } else {
                                                                System.out.println("Wrong PIN. Try again:");
                                                                if (input.nextInt() == pin) {
                                                                    System.out.println("Transaction Successful");
                                                                } else {
                                                                    System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                                }
                                                            }
                                                break;
                                            default:
                                                System.out.println("Invalid Option");
                                        }
                                        break;
                                }
                                break;

                        case 2:
                                System.out.println("Other Number");
                                System.out.println("Input phone No.");
                                String phone8 = input.next();
                                if(phone8.length() == 10){
                                    System.out.println("You have entered: " + phone8);
                                    System.out.println("Select Bundle\n1: Kazi Bundle");
                                    int option23 = input.nextInt();
                                    switch(option23){
                                        case 1:
                                            System.out.println("Kazi Bundle");
                                            System.out.println("Select Bundle\n1: Buy Small for 100000 \n2: Buy Medium for 150000 \n3: Buy Large for 250000");
                                            int option24 = input.nextInt();
                                            switch(option24){
                                                case 1:
                                                    System.out.println("Buy Small for 100000");
                                                    System.out.println("you're about to buy Small for 100000 for " + phone8);
                                                    System.out.println("Enter PIN:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful for " + phone8);
                                                    } else {
                                                        System.out.println("Wrong PIN. Try again:");
                                                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("Buy Medium for 150000");
                                                    System.out.println("you're about to buy Medium for 150000 for " + phone8);
                                                    System.out.println("Enter PIN:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful for " + phone8);
                                                    } else {
                                                        System.out.println("Wrong PIN. Try again:");
                                                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Buy Large for 250000");
                                                    System.out.println("you're about to buy Large for 250000 for " + phone8);
                                                    System.out.println("Enter PIN:");
                                                    if (input.nextInt() == pin) {
                                                        System.out.println("Transaction Successful for " + phone8);
                                                    } else {
                                                        System.out.println("Wrong PIN. Try again:");
                                                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    System.out.println("Invalid Option");
                                            }
                                            break;
                                    }
                                } else {
                                    System.out.println("Invalid Phone Number");
                                }
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Buy Airtime Stock");
                        System.out.println("Yello. You're purchasing airtime stock. Please Enter amount");
                        int airtime = input.nextInt();
                        System.out.println("Yello. You're buying Airtime stock of Ugx" + airtime + " To confirm enter Mobile Money Pin");
                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    break;

                    case 6:
                        System.out.println("Music & Video");
                        System.out.println("Choose Option \n1:Startimes \n2:DStv Now");
                        int option25 = input.nextInt();
                        switch(option25){
                            case 1:
                                System.out.println("Startimes");
                                System.out.println("Select\n1:My Number \n2:Other Number");
                                int option26 = input.nextInt();
                                switch(option26){
                                    case 1:
                                        System.out.println("My Number");
                                        System.out.println("select option\n1:2hrs for 2000\n2:4hrs for 4000");
                                        int option27 = input.nextInt();
                                        switch(option27){
                                            case 1:
                                                System.out.println("2hrs for 2000");
                                                System.out.println("you're about to buy 2hrs for 2000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                            break;
                                            case 2:
                                                System.out.println("4hrs for 4000");
                                                System.out.println("you're about to buy 4hrs for 4000 for " + mobile);
                                                System.out.println("Enter pin to complete the transaction");
                                                if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                            break;
                                            default:
                                                System.out.println("Invalid Option");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Other Number");
                                        System.out.println("Input phone No.");
                                        String phone9 = input.next();
                                        if(phone9.length() == 10){
                                            System.out.println("You have entered: " + phone9);
                                            System.out.println("Select Option\n1:2hrs for 2000\n2:4hrs for 4000");
                                            int option28 = input.nextInt();
                                            switch(option28){
                                                case 1:
                                                    System.out.println("2hrs for 2000");
                                                    System.out.println("you're about to buy 2hrs for 2000 for " + phone9);
                                                    System.out.println("Enter pin to complete the transaction");
                                                    if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    break;
                                                    case 2:
                                                        System.out.println("4hrs for 4000");
                                                        System.out.println("you're about to buy 4hrs for 4000 for " + phone9);
                                                        System.out.println("Enter pin to complete the transaction");
                                                        if (input.nextInt() == pin) {
                                                            System.out.println("Transaction Successful");
                                                        } else {
                                                            System.out.println("Wrong PIN again. Transaction Cancelled.");
                                                        }
                                                    break;
                                                default:
                                                    System.out.println("Invalid Option");
                                                    break;
                                            }
                                        } else {
                                            System.out.println("Invalid Phone Number");
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                    case 0:
                        System.out.println("Returning to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }
                break;

            case 3:
                System.out.println("Withdraw Money");
                double amountW;
                final double MAX_WITHDRAWAL_AMOUNT = 7000000.0; // Maximum allowed withdrawal amount

                while (true) {
                    System.out.println("Enter Amount to withdraw:");
                    amountW = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    if (amountW > MAX_WITHDRAWAL_AMOUNT) {
                        System.out.println("Amount exceeds maximum withdrawal limit of " + String.format("%,.2f", MAX_WITHDRAWAL_AMOUNT) + ". Please reduce the amount.");
                    } else if (amountW <= 0) {
                        System.out.println("Amount must be greater than zero. Please enter a valid amount.");
                    } else {
                        break; // Valid amount entered
                    }
                }

                double charges;
                if (amountW <= 50000) {
                    charges = 500;
                } else if (amountW <= 500000) {
                    charges = 1000;
                } else {
                    charges = 2000;
                }

                double netWithdrawal = amountW - charges;

                System.out.println("You are about to withdraw: " + String.format("%,.2f", amountW));
                System.out.println("Charges: " + String.format("%,.2f", charges));

                if (verifyPin(input, pin)) {
                    System.out.println("Withdrawal of " + String.format("%,.2f", amountW) + " successful. Charges: " + String.format("%,.2f", charges) + ". You will receive " + String.format("%,.2f", netWithdrawal) + ".");
                }
                break;

            case 4:
                System.out.println("Pay Bills");
                System.out.println("1: NWSC (Water)\n2: UEDCL(light)");
                int billChoice = input.nextInt();

                System.out.println("Enter 11-digit Meter Number:");
                String meterNum = input.next();

                if (meterNum.length() == 11) {
                    System.out.println("Enter Amount:");
                    double billAmt = input.nextDouble();
                    String service = (billChoice == 1) ? "Water" : "UEDCL(light)";

                    System.out.println("You are paying Ugx " + billAmt + " for " + service + " meter number " + meterNum);
                    
                    if (verifyPin(input, pin)) {
                        System.out.println(service + " Payment Successful!");
                        if (billChoice == 2) {
                            double units = billAmt / 800.0; // Price: 800 per unit
                            System.out.println("UEDCL(light) Units Purchased: " + units);
                            System.out.println("Your Token: " + generateToken());
                        }
                    }
                } else {
                    System.out.println("Wrong Meter Number. Transaction Failed.");
                }
                break;

            case 5:
                System.out.println("Make Payment (TV Subscriptions)");
                System.out.println("Select TV Provider:\n1: DStv \n2: GOtv \n3: Startimes \n4: Zuku");
                int tvChoice = input.nextInt();
                String provider = "";
                String packageBought = "";
                double tvPrice = 0;

                switch (tvChoice) {
                    case 1:
                        provider = "DStv";
                        System.out.println("Select DStv Package:\n1: Compact @ 100,000 \n2: Compact Plus @ 160,000 \n3: Premium @ 250,000");
                        int p1 = input.nextInt();
                        if (p1 == 1) { packageBought = "Compact"; tvPrice = 100000; }
                        else if (p1 == 2) { packageBought = "Compact Plus"; tvPrice = 160000; }
                        else if (p1 == 3) { packageBought = "Premium"; tvPrice = 250000; }
                        break;
                    case 2:
                        provider = "GOtv";
                        System.out.println("Select GOtv Package:\n1: Lite @ 15,000 \n2: Value @ 20,000 \n3: Max @ 50,000");
                        int p2 = input.nextInt();
                        if (p2 == 1) { packageBought = "Lite"; tvPrice = 15000; }
                        else if (p2 == 2) { packageBought = "Value"; tvPrice = 20000; }
                        else if (p2 == 3) { packageBought = "Max"; tvPrice = 50000; }
                        break;
                    case 3:
                        provider = "Startimes";
                        System.out.println("Select Startimes Package:\n1: Nova @ 15,000 \n2: Basic @ 25,000 \n3: Classic @ 35,000");
                        int p3 = input.nextInt();
                        if (p3 == 1) { packageBought = "Nova"; tvPrice = 15000; }
                        else if (p3 == 2) { packageBought = "Basic"; tvPrice = 25000; }
                        else if (p3 == 3) { packageBought = "Classic"; tvPrice = 35000; }
                        break;
                    case 4:
                        provider = "Zuku";
                        System.out.println("Select Zuku Package:\n1: Smart @ 25,000 \n2: Classic @ 40,000 \n3: Premium @ 60,000");
                        int p4 = input.nextInt();
                        if (p4 == 1) { packageBought = "Smart"; tvPrice = 25000; }
                        else if (p4 == 2) { packageBought = "Classic"; tvPrice = 40000; }
                        else if (p4 == 3) { packageBought = "Premium"; tvPrice = 60000; }
                        break;
                    default:
                        System.out.println("Invalid Provider Selected.");
                }

                if (!provider.isEmpty() && !packageBought.isEmpty()) {
                    System.out.println("Enter 12-digit Smart Card Number:");
                    String smartCard = input.next();
                    
                    if (smartCard.length() == 12 && smartCard.matches("\\d+")) {
                        System.out.println("You are about to pay Ugx " + String.format("%,.0f", tvPrice) + " for " + provider + " " + packageBought + " for card: " + smartCard);
                        if (verifyPin(input, pin)) {
                            System.out.println("Transaction Successful!");
                            System.out.println(provider + " " + packageBought + " package has been successfully activated for card " + smartCard + ".");
                        }
                    } else {
                        System.out.println("Invalid Smart Card Number. It must be exactly 12 digits.");
                    }
                } else if (tvChoice >= 1 && tvChoice <= 4) {
                    System.out.println("Invalid Package Selection.");
                }
                break;

            case 0:
                System.out.println("Thank you for using MTN MoMo. Goodbye!");
                return; // Ends the program

            default:
                System.out.println("Invalid Main Menu Option. Try again.");
                break;
        }
        System.out.println(); // Add a newline for readability between transactions
        }
    }
}