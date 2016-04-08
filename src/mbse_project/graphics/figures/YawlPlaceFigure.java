package mbse_project.graphics.figures;

import java.awt.Color;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.PlaceFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import yawl.Yawl.PlaceType;
import yawl.Yawl.PlaceTypes;
import yawl.Yawl.impl.PlaceTypeImpl;

public class YawlPlaceFigure extends PlaceFigure{

	public YawlPlaceFigure(Place place) {
		super(place);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		super.fillShape(graphics);
		
		if (((yawl.Yawl.Place) super.place).getType() != null){
			if(((yawl.Yawl.Place)super.place).getType().getText() == PlaceTypes.END){
				Rectangle rect = this.getClientArea();
				int py = rect.y + rect.height/4;
				int px = rect.x + rect.width/4;
				
				graphics.setBackgroundColor(getForegroundColor());
				graphics.setLineWidth(3);
				graphics.drawRectangle(px, py, rect.width/2, rect.height/2);
				
			}
		}
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update() {
		
		this.repaint();
	}
	

}
