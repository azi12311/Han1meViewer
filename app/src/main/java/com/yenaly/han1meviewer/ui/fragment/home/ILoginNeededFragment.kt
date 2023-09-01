package com.yenaly.han1meviewer.ui.fragment.home

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.yenaly.han1meviewer.isAlreadyLogin

/**
 * @project Han1meViewer
 * @author Yenaly Liew
 * @time 2023/08/29 029 15:32
 */
interface ILoginNeededFragment {
    fun Fragment.checkLogin() {
        if (!isAlreadyLogin) {
            findNavController().navigateUp()
        }
    }
}