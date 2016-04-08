package mbse_project.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.gmf.extensions.graphics.IUpdateableFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Place;

import mbse_project.graphics.figures.YawlArcFigure;
import mbse_project.graphics.figures.YawlPlaceFigure;
import yawl.Yawl.impl.YawlPackageImpl;

public class YAWLGraphics extends GraphicalExtension {
	@Override
	public List<EClass> getExtendedNetTypes() {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(YawlPackageImpl.eINSTANCE.getYAWLNet());
		return list;
	}
	
	@Override
	public List<EClass> getExtendedNetObjects(EClass netType) {
		ArrayList<EClass> list = new ArrayList<EClass>();
		list.add(YawlPackageImpl.eINSTANCE.getArc());
		list.add(YawlPackageImpl.eINSTANCE.getPlace());
		return list;
	}
	
	@Override
	public IArcFigure createArcFigure(Arc arc) {

		return new YawlArcFigure(arc);
	}
	
	@Override
	public IUpdateableFigure createPlaceFigure(Place place) {
		
		return new YawlPlaceFigure(place);
	}
}
