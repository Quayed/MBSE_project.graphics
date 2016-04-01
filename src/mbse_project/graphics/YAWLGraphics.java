package mbse_project.graphics;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.gmf.extensions.graphics.GraphicalExtension;
import org.pnml.tools.epnk.gmf.extensions.graphics.IArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import mbse_project.graphics.figures.YawlArcFigure;
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
		return list;
	}
	
	@Override
	public IArcFigure createArcFigure(Arc arc) {
		// TODO Auto-generated method stub
		return new YawlArcFigure(arc);
	}
}
