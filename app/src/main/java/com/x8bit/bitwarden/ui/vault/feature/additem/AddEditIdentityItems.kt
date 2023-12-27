package com.x8bit.bitwarden.ui.vault.feature.additem

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.x8bit.bitwarden.R
import com.x8bit.bitwarden.ui.platform.components.BitwardenListHeaderText
import com.x8bit.bitwarden.ui.platform.components.BitwardenMultiSelectButton
import com.x8bit.bitwarden.ui.platform.components.BitwardenSwitch
import com.x8bit.bitwarden.ui.platform.components.BitwardenSwitchWithActions
import com.x8bit.bitwarden.ui.platform.components.BitwardenTextField
import com.x8bit.bitwarden.ui.vault.feature.additem.handlers.VaultAddIdentityItemTypeHandlers
import com.x8bit.bitwarden.ui.vault.feature.additem.handlers.VaultAddItemCommonHandlers
import com.x8bit.bitwarden.ui.vault.model.VaultLinkedFieldType
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList

/**
 * The UI for adding and editing an identity cipher.
 */
@Suppress("LongMethod")
fun LazyListScope.addEditIdentityItems(
    commonState: VaultAddItemState.ViewState.Content.Common,
    identityState: VaultAddItemState.ViewState.Content.ItemType.Identity,
    isAddItemMode: Boolean,
    commonTypeHandlers: VaultAddItemCommonHandlers,
    identityItemTypeHandlers: VaultAddIdentityItemTypeHandlers,
) {
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.name),
            value = commonState.name,
            onValueChange = commonTypeHandlers.onNameTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        TitleMultiSelectButton(
            selectedTitle = identityState.selectedTitle,
            onTitleSelected = identityItemTypeHandlers.onTitleSelected,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.first_name),
            value = identityState.firstName,
            onValueChange = identityItemTypeHandlers.onFirstNameTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.middle_name),
            value = identityState.middleName,
            onValueChange = identityItemTypeHandlers.onMiddleNameTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.last_name),
            value = identityState.lastName,
            onValueChange = identityItemTypeHandlers.onLastNameTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.username),
            value = identityState.username,
            onValueChange = identityItemTypeHandlers.onUsernameTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.company),
            value = identityState.company,
            onValueChange = identityItemTypeHandlers.onCompanyTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.ssn),
            value = identityState.ssn,
            onValueChange = identityItemTypeHandlers.onSsnTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.passport_number),
            value = identityState.passportNumber,
            onValueChange = identityItemTypeHandlers.onPassportNumberTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.license_number),
            value = identityState.licenseNumber,
            onValueChange = identityItemTypeHandlers.onLicenseNumberTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.email),
            value = identityState.email,
            onValueChange = identityItemTypeHandlers.onEmailTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.phone),
            value = identityState.phone,
            onValueChange = identityItemTypeHandlers.onPhoneTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.address1),
            value = identityState.address1,
            onValueChange = identityItemTypeHandlers.onAddress1TextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.address2),
            value = identityState.address2,
            onValueChange = identityItemTypeHandlers.onAddress2TextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.address3),
            value = identityState.address3,
            onValueChange = identityItemTypeHandlers.onAddress3TextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.city_town),
            value = identityState.city,
            onValueChange = identityItemTypeHandlers.onCityTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.zip_postal_code),
            value = identityState.zip,
            onValueChange = identityItemTypeHandlers.onZipTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            label = stringResource(id = R.string.country),
            value = identityState.country,
            onValueChange = identityItemTypeHandlers.onCountryTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(24.dp))
        BitwardenListHeaderText(
            label = stringResource(id = R.string.miscellaneous),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }
    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenMultiSelectButton(
            label = stringResource(id = R.string.folder),
            options = commonState.availableFolders.map { it.invoke() }.toImmutableList(),
            selectedOption = commonState.folderName.invoke(),
            onOptionSelected = commonTypeHandlers.onFolderTextChange,
            modifier = Modifier.padding(horizontal = 16.dp),
        )
    }

    item {
        Spacer(modifier = Modifier.height(16.dp))
        BitwardenSwitch(
            label = stringResource(
                id = R.string.favorite,
            ),
            isChecked = commonState.favorite,
            onCheckedChange = commonTypeHandlers.onToggleFavorite,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }

    item {
        Spacer(modifier = Modifier.height(16.dp))
        BitwardenSwitchWithActions(
            label = stringResource(id = R.string.password_prompt),
            isChecked = commonState.masterPasswordReprompt,
            onCheckedChange = commonTypeHandlers.onToggleMasterPasswordReprompt,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            actions = {
                IconButton(onClick = commonTypeHandlers.onTooltipClick) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_tooltip),
                        tint = MaterialTheme.colorScheme.onSurface,
                        contentDescription = stringResource(
                            id = R.string.master_password_re_prompt_help,
                        ),
                    )
                }
            },
        )
    }

    item {
        Spacer(modifier = Modifier.height(24.dp))
        BitwardenListHeaderText(
            label = stringResource(id = R.string.notes),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }

    item {
        Spacer(modifier = Modifier.height(8.dp))
        BitwardenTextField(
            singleLine = false,
            label = stringResource(id = R.string.notes),
            value = commonState.notes,
            onValueChange = commonTypeHandlers.onNotesTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }

    item {
        Spacer(modifier = Modifier.height(24.dp))
        BitwardenListHeaderText(
            label = stringResource(id = R.string.custom_fields),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }

    items(commonState.customFieldData) { customItem ->
        AddEditCustomField(
            customItem,
            onCustomFieldValueChange = commonTypeHandlers.onCustomFieldValueChange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            supportedLinkedTypes = persistentListOf(
                VaultLinkedFieldType.PASSWORD,
                VaultLinkedFieldType.USERNAME,
            ),
        )
    }

    item {
        Spacer(modifier = Modifier.height(16.dp))
        AddEditCustomFieldsButton(
            onFinishNamingClick = commonTypeHandlers.onAddNewCustomFieldClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
    }

    if (isAddItemMode) {
        item {
            Spacer(modifier = Modifier.height(24.dp))
            BitwardenListHeaderText(
                label = stringResource(id = R.string.ownership),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
            )
        }

        item {
            Spacer(modifier = Modifier.height(8.dp))
            BitwardenMultiSelectButton(
                label = stringResource(id = R.string.who_owns_this_item),
                options = commonState.availableOwners.toImmutableList(),
                selectedOption = commonState.ownership,
                onOptionSelected = commonTypeHandlers.onOwnershipTextChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
            )
        }
    }
    item {
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun TitleMultiSelectButton(
    selectedTitle: VaultAddItemState.ViewState.Content.ItemType.Identity.Title,
    onTitleSelected: (VaultAddItemState.ViewState.Content.ItemType.Identity.Title) -> Unit,
    modifier: Modifier = Modifier,
) {
    val resources = LocalContext.current.resources
    BitwardenMultiSelectButton(
        label = stringResource(id = R.string.title),
        options = VaultAddItemState.ViewState.Content.ItemType.Identity.Title
            .entries
            .map { it.value() }
            .toImmutableList(),
        selectedOption = selectedTitle.value(),
        onOptionSelected = { selectedString ->
            onTitleSelected(
                VaultAddItemState.ViewState.Content.ItemType.Identity.Title
                    .entries
                    .first { it.value.toString(resources) == selectedString },
            )
        },
        modifier = modifier,
    )
}