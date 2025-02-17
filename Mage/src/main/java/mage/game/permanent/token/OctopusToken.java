package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class OctopusToken extends TokenImpl {

    public OctopusToken() {
        super("Octopus Token", "8/8 blue Octopus creature token");
        cardType.add(CardType.CREATURE);
        color.setBlue(true);
        subtype.add(SubType.OCTOPUS);
        power = new MageInt(8);
        toughness = new MageInt(8);
    }

    public OctopusToken(final OctopusToken token) {
        super(token);
    }

    public OctopusToken copy() {
        return new OctopusToken(this);
    }
}
