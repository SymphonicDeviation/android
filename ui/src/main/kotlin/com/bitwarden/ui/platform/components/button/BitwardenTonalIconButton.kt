package com.bitwarden.ui.platform.components.button

import androidx.annotation.DrawableRes
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import com.bitwarden.ui.platform.components.button.color.bitwardenTonalIconButtonColors
import com.bitwarden.ui.platform.components.util.rememberVectorPainter
import com.bitwarden.ui.platform.resource.BitwardenDrawable
import com.bitwarden.ui.platform.theme.BitwardenTheme

/**
 * A tonal icon button that displays an icon.
 *
 * @param vectorIconRes Icon to display on the button.
 * @param contentDescription The content description for this icon button.
 * @param onClick Callback for when the icon button is clicked.
 * @param modifier A [Modifier] for the composable.
 * @param isEnabled Whether or not the button should be enabled.
 */
@Composable
fun BitwardenTonalIconButton(
    @DrawableRes vectorIconRes: Int,
    contentDescription: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
) {
    FilledIconButton(
        modifier = modifier.semantics(mergeDescendants = true) {
            this.contentDescription = contentDescription
        },
        onClick = onClick,
        colors = bitwardenTonalIconButtonColors(),
        enabled = isEnabled,
    ) {
        Icon(
            painter = rememberVectorPainter(id = vectorIconRes),
            contentDescription = contentDescription,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BitwardenTonalIconButton_preview() {
    BitwardenTheme {
        BitwardenTonalIconButton(
            vectorIconRes = BitwardenDrawable.ic_question_circle,
            contentDescription = "Sample Icon",
            onClick = {},
        )
    }
}
