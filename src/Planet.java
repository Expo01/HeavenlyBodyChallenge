/**
 * Created by dev on 5/02/2016.
 */
public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyTypes.MOON) { //testing to make sure is moon since planet sattelite can only be a moon
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }
}
