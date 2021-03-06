package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class GoldCard extends DomCard {

    public GoldCard() {
        super(DomCardName.Gold);
    }

    @Override
    public void play() {
        if (owner.isEnviousActive()) {
            owner.addAvailableCoinsSilent(1);
        } else {
            owner.addAvailableCoinsSilent(3);
        }
    }

    @Override
    public void doWhenGained() {
        if (owner.getCurrentGame().getBoard().isLandmarkActive(DomCardName.Aqueduct))
            owner.getCurrentGame().getBoard().moveVPFromTo(this.getName(),DomCardName.Aqueduct);
    }
}