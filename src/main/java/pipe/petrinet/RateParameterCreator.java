package pipe.petrinet;

import org.w3c.dom.Element;
import pipe.views.viewComponents.RateParameter;

public class RateParameterCreator {
    public RateParameter createRateParameter(Element element) {
        int x = CreatorUtils.zeroOrValueOfInt(element.getAttribute("positionX"));
        int y = CreatorUtils.zeroOrValueOfInt(element.getAttribute("positionY"));
        String name = element.getAttribute("name");
        double value = CreatorUtils.zeroOrValueOf(element.getAttribute("expression"));
        return new RateParameter(name, value, x, y);
    }
}
