package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class PovertyCard extends DomCard {
    public PovertyCard() {
      super( DomCardName.Poverty);
    }

    public void play() {
        owner.doForcedDiscard(owner.getCardsInHand().size()-3, false);
    }
}