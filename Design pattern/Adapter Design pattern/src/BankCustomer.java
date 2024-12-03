//ADAPTER CLASS

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements  CreditCard {

    @Override
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Bank Name :");
            String bName = br.readLine();
            System.out.println("Enter Acc holder Name :");
            String accHolderName = br.readLine();
            System.out.println("Enter Acc Number :");
            long accNumber =Long.parseLong(br.readLine());

            setbName(bName);
            setAccHolderName(accHolderName);
            setAccNumber(accNumber);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        }


    @Override
    public String getCreditCards() {
        long accNumber=getAccNumber();
        String bName=getbName();
        String accHolderName=getAccHolderName();


        return ("The Account number "+accNumber+" of "+accHolderName+" in "+bName+
       "bank is valid and authenticated for issuing the credit card. ");
    }
}
