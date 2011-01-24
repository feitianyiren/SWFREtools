package tv.porst.swfretools.parser.structures;

import tv.porst.splib.io.Bits;
import tv.porst.splib.io.Flag;
import tv.porst.splib.io.UINT8;

/**
 * Represents a GradientGlowFilter structure.
 * 
 * @author sp
 *
 */
public final class GradientGlowFilter {

	/**
	 * Number of colors in the gradient.
	 */
	private final UINT8 numColors;

	/**
	 * Gradient colors.
	 */
	private final RGBA[] gradientColors;

	/**
	 * Gradient ratios.
	 */
	private final UINT8[] gradientRatio;

	/**
	 * Horizontal blur amount.
	 */
	private final Fixed blurX;

	/**
	 * Vertical blur amount.
	 */
	private final Fixed blurY;

	/**
	 * Radian angle of the gradient glow.
	 */
	private final Fixed angle;

	/**
	 * Distance of the gradient glow.
	 */
	private final Fixed distance;

	/**
	 * Strength of the gradient glow.
	 */
	private final Fixed8 strength;

	/**
	 * Inner glow mode.
	 */
	private final Flag innerShadow;

	/**
	 * Knockout mode.
	 */
	private final Flag knockout;

	/**
	 * Composite source.
	 */
	private final Flag compositeSource;

	/**
	 * On Top mode.
	 */
	private final Flag onTop;

	/**
	 * Number of blur passes.
	 */
	private final Bits passes;

	/**
	 * Creates a new GradientGlowFilter object.
	 * 
	 * @param numColors Number of colors in the gradient.
	 * @param gradientColors Gradient colors.
	 * @param gradientRatio Gradient ratios.
	 * @param blurX Horizontal blur amount.
	 * @param blurY Vertical blur amount.
	 * @param angle Radian angle of the gradient glow.
	 * @param distance Distance of the gradient glow.
	 * @param strength Strength of the gradient glow.
	 * @param innerShadow Inner glow mode.
	 * @param knockout Knockout mode.
	 * @param compositeSource Composite source.
	 * @param onTop On Top mode.
	 * @param passes Number of blur passes.
	 */
	public GradientGlowFilter(final UINT8 numColors, final RGBA[] gradientColors,
			final UINT8[] gradientRatio, final Fixed blurX, final Fixed blurY, final Fixed angle,
			final Fixed distance, final Fixed8 strength, final Flag innerShadow,
			final Flag knockout, final Flag compositeSource, final Flag onTop, final Bits passes) {

		this.numColors = numColors;
		this.gradientColors = gradientColors;
		this.gradientRatio = gradientRatio;
		this.blurX = blurX;
		this.blurY = blurY;
		this.angle = angle;
		this.distance = distance;
		this.strength = strength;
		this.innerShadow = innerShadow;
		this.knockout = knockout;
		this.compositeSource = compositeSource;
		this.onTop = onTop;
		this.passes = passes;

	}

	/**
	 * Returns the radian angle of the gradient glow.
	 *
	 * @return The radian angle of the gradient glow.
	 */
	public Fixed getAngle() {
		return angle;
	}

	/**
	 * Returns the horizontal blur amount.
	 *
	 * @return The horizontal blur amount.
	 */
	public Fixed getBlurX() {
		return blurX;
	}

	/**
	 * Returns the vertical blur amount.
	 *
	 * @return The vertical blur amount.
	 */
	public Fixed getBlurY() {
		return blurY;
	}

	/**
	 * Returns the composite source.
	 *
	 * @return The composite source.
	 */
	public Flag getCompositeSource() {
		return compositeSource;
	}

	/**
	 * Returns the distance of the gradient glow.
	 *
	 * @return The distance of the gradient glow.
	 */
	public Fixed getDistance() {
		return distance;
	}

	/**
	 * Returns the gradient colors.
	 *
	 * @return The gradient colors.
	 */
	public RGBA[] getGradientColors() {
		return gradientColors;
	}

	/**
	 * Returns the gradient ratios.
	 *
	 * @return The gradient ratios.
	 */
	public UINT8[] getGradientRatio() {
		return gradientRatio;
	}

	/**
	 * Returns the inner glow mode.
	 *
	 * @return The inner glow mode.
	 */
	public Flag getInnerShadow() {
		return innerShadow;
	}

	/**
	 * Returns the knockout mode.
	 *
	 * @return The knockout mode.
	 */
	public Flag getKnockout() {
		return knockout;
	}

	/**
	 * Returns the number of colors in the gradient.
	 *
	 * @return The number of colors in the gradient.
	 */
	public UINT8 getNumColors() {
		return numColors;
	}

	/**
	 * Returns the On Top mode.
	 *
	 * @return The On Top mode.
	 */
	public Flag getOnTop() {
		return onTop;
	}

	/**
	 * Returns the number of blur passes.
	 *
	 * @return The number of blur passes.
	 */
	public Bits getPasses() {
		return passes;
	}

	/**
	 * Returns the strength of the gradient glow.
	 *
	 * @return The strength of the gradient glow.
	 */
	public Fixed8 getStrength() {
		return strength;
	}
}