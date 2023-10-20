package fitness_center_challenge.models;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private String activityName;
    private List<Member> memberList;
    private Trainer trainer;

    public Activity (String activityName) {
        this.activityName = activityName;
        memberList = new ArrayList<>();
    }

    public void addMemberToActivity(Member member) {
        memberList.add(member);
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activityName='" + activityName + '\'' +
                ", memberList=" + memberList +
                ", trainer=" + trainer +
                '}';
    }
}
