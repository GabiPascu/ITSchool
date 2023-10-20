package fitness_center_challenge;

import fitness_center_challenge.models.Activity;
import fitness_center_challenge.models.FitnessClass;
import fitness_center_challenge.models.Member;

public class GymApp {

    public static void main(String[] args) {
        Member marcela = new Member("Marcela");

        Activity fitnessForBoys = new FitnessClass("Fitness for Gym Bros");
        fitnessForBoys.addMemberToActivity(marcela);

        System.out.println(fitnessForBoys.getMemberList());
        System.out.println(marcela.getUserID());


    }
}
