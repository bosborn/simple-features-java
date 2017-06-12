package mil.nga.wkb.geom;

/**
 * A single location in space. Each point has an X and Y coordinate. A point MAY
 * optionally also have a Z and/or an M value.
 * 
 * @author osbornb
 */
public class Point extends Geometry {

	/**
	 * X coordinate
	 */
	private double x;

	/**
	 * Y coordinate
	 */
	private double y;

	/**
	 * Z coordinate
	 */
	private Double z;

	/**
	 * M value
	 */
	private Double m;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 */
	public Point(double x, double y) {
		this(false, false, x, y);
	}

	/**
	 * Constructor
	 */
	public Point() {
		this(0.0, 0.0);
	}

	/**
	 * Constructor
	 * 
	 * @param hasZ
	 *            has z
	 * @param hasM
	 *            has m
	 * @param x
	 *            x coordinate
	 * @param y
	 *            y coordinate
	 */
	public Point(boolean hasZ, boolean hasM, double x, double y) {
		super(GeometryType.POINT, hasZ, hasM);
		this.x = x;
		this.y = y;
	}

	/**
	 * Constructor
	 * 
	 * @param point
	 *            point to copy
	 */
	public Point(Point point) {
		this(point.hasZ(), point.hasM(), point.getX(), point.getY());
		setZ(point.getZ());
		setM(point.getM());
	}

	/**
	 * Get x
	 * 
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/**
	 * Set x
	 * 
	 * @param x
	 *            x coordinate
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Get y
	 * 
	 * @return y
	 */
	public double getY() {
		return y;
	}

	/**
	 * Set y
	 * 
	 * @param y
	 *            y coordinate
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Get z
	 * 
	 * @return z
	 */
	public Double getZ() {
		return z;
	}

	/**
	 * Set z
	 * 
	 * @param z
	 *            z coordinate
	 */
	public void setZ(Double z) {
		this.z = z;
	}

	/**
	 * Get m
	 * 
	 * @return m
	 */
	public Double getM() {
		return m;
	}

	/**
	 * Set m
	 * 
	 * @param m
	 *            m coordinate
	 */
	public void setM(Double m) {
		this.m = m;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Geometry copy() {
		return new Point(this);
	}

}
