package com.x8bit.bitwarden.data.vault.repository.model

import com.bitwarden.core.CipherView
import com.bitwarden.core.FolderView

/**
 * Represents decrypted vault data.
 *
 * @param cipherViewList List of decrypted ciphers.
 * @param folderViewList List of decrypted folders.
 */
data class VaultData(
    val cipherViewList: List<CipherView>,
    val folderViewList: List<FolderView>,
)