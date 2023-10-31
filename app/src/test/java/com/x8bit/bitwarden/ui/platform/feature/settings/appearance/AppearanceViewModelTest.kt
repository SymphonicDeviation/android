package com.x8bit.bitwarden.ui.platform.feature.settings.appearance

import app.cash.turbine.test
import com.x8bit.bitwarden.ui.platform.base.BaseViewModelTest
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppearanceViewModelTest : BaseViewModelTest() {

    @Test
    fun `on BackClick should emit NavigateBack`() = runTest {
        val viewModel = AppearanceViewModel()
        viewModel.eventFlow.test {
            viewModel.trySendAction(AppearanceAction.BackClick)
            assertEquals(AppearanceEvent.NavigateBack, awaitItem())
        }
    }
}