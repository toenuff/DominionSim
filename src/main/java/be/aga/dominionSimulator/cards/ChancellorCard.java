package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class ChancellorCard extends DomCard {
    public ChancellorCard () {
      super( DomCardName.Chancellor);
    }

    public void play() {
        owner.addAvailableCoins(2);
        if (owner.isHumanOrPossessedByHuman()) {
            if (owner.getEngine().getGameFrame().askPlayer("Put deck in discard?" , "Resolving " + this.getName().toString()))
                owner.putDeckInDiscard();
        } else {
            owner.putDeckInDiscard();
        }
    }
    @Override
    public int getPlayPriority() {
    	if (owner.getActionsLeft()>1)
    		return DomCardName.Counting_House.getPlayPriority()-1;
    	return super.getPlayPriority();
    }
}