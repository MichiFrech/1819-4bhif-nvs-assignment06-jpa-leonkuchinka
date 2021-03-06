package at.htl.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="HobbyPlayer.findall", query = "select h from HobbyPlayer h")
public class HobbyPlayer extends Golfer {
    private boolean isPremiumMember;

    //region Constuctors
    public HobbyPlayer() {
    }

    public HobbyPlayer(String name, double hcp, int age, boolean isPremiumMember) {
        super(name, hcp, age);
        this.isPremiumMember = isPremiumMember;
    }
    //endregion

    //region Getter and Setter
    public boolean isPremiumMember() {
        return isPremiumMember;
    }

    public void setPremiumMember(boolean premiumMember) {
        isPremiumMember = premiumMember;
    }
    //endregion
}
