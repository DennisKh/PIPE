package pipe.petrinet;

import org.w3c.dom.Element;
import pipe.models.Annotation;
import pipe.models.Place;

public class AnnotationCreator {
    public Annotation createAnnotation(Element element) {
        double x = CreatorUtils.zeroOrValueOf(element.getAttribute("xPosition"));
        double y = CreatorUtils.zeroOrValueOf(element.getAttribute("yPosition"));
        double height = CreatorUtils.zeroOrValueOf(element.getAttribute("h"));
        double width = CreatorUtils.zeroOrValueOf(element.getAttribute("w"));
        String text = element.getAttribute("txt");
        boolean border = CreatorUtils.falseOrValueOf(element.getAttribute("border"));

        return new Annotation(x, y, text, width, height, border);
    }
}
