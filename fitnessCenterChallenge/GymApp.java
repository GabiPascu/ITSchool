package fitnessCenterChallenge;

import fitnessCenterChallenge.models.Activity;
import fitnessCenterChallenge.models.FitnessClass;
import fitnessCenterChallenge.models.Member;

import java.util.UUID;

public class GymApp {

    public static void main(String[] args) {
        Member marcela = new Member("Marcela");

        Activity fitnessForBoys = new FitnessClass("Fitness for Gym Bros");
        fitnessForBoys.addMemberToActivity(marcela);

        System.out.println(fitnessForBoys.getMemberList());
        System.out.println(marcela.getUserID());


    }
}
