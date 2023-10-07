package com.mod;

import java.util.Scanner;

public class GameCardDetails {
    public CardPoints getCardDetails()
    {
        Scanner sc = new Scanner(System.in);
        CardPoints cp=new CardPoints();
        int cardId;
        String holderName;
        int balancePoints;
        System.out.println("Enter card id");
        cardId=sc.nextInt();
        System.out.println("Enter card holder name");
        holderName=sc.next();

        do{
            System.out.println("Enter balance points");
            balancePoints = sc.nextInt();
            if(balancePoints<=0){
                System.out.println("Balance points should be positive");
            }
        }while(balancePoints<=0);

        cp.setCardId(cardId);
        cp.setHolderName(holderName);
        cp.setBalancePoints(balancePoints);
        return cp;
    }
    public int getPointUsage()
    {
        Scanner sc = new Scanner(System.in);
        int points;
        do{
            System.out.println("Enter points should be used");
            points =sc.nextInt();
            if(points<=0){
                System.out.println("Points should be positive");
            }
        }while(points<=0);
        return points;
    }

    public static void main(String[] arg)
    {
        CardPoints cp = new CardPoints();
        GameCardDetails cd=new GameCardDetails();
        cp=cd.getCardDetails();
        int points=cd.getPointUsage();
        cp.withdrawPoints(points);
    }
}
