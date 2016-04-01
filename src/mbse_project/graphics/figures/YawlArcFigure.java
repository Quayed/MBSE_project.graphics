package mbse_project.graphics.figures;

import org.eclipse.swt.SWT;
import org.pnml.tools.epnk.gmf.extensions.graphics.figures.ArcFigure;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;

import yawl.Yawl.ArcTypes;

public class YawlArcFigure extends ArcFigure {

	public YawlArcFigure(Arc arc) {
		super(arc);
		
		this.setLineStyle(SWT.LINE_SOLID);
	}
	
	@Override
	public void update(){
		
		if(((yawl.Yawl.Arc)super.arc).getType() == null){
			this.setLineStyle(SWT.LINE_SOLID);
		} else{
			this.setLineStyle(SWT.LINE_DASH);
		}
	}

}
