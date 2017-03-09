package mil.nga.wkb.geom;

/**
 * Circular String, Curve sub type
 * 
 * @author osbornb
 */
public class CircularString extends LineString {

	/**
	 * Constructor
	 */
	public CircularString() {
		this(false, false);
	}
	
	/**
	 * Constructor
	 * 
	 * @param hasZ
	 *            has z
	 * @param hasM
	 *            has m
	 */
	public CircularString(boolean hasZ, boolean hasM) {
		super(GeometryType.CIRCULARSTRING, hasZ, hasM);
	}

}
