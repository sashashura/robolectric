package org.robolectric.shadows;

import static com.google.common.truth.Truth.assertThat;
import static org.robolectric.Shadows.shadowOf;

import android.graphics.drawable.GradientDrawable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class ShadowGradientDrawableTest {
  @Test
  public void testGetColor_returnsColor() throws Exception {
    GradientDrawable gradientDrawable = new GradientDrawable();
    ShadowGradientDrawable shadowGradientDrawable = shadowOf(gradientDrawable);
    int color = 123;
    gradientDrawable.setColor(color);
    assertThat(shadowGradientDrawable.getLastSetColor()).isEqualTo(color);
  }
}
