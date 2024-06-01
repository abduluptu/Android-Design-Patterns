package com.soha.infotech.androiddesignpatterns.designpatterns

/**
 * Step2: Factory design pattern
 */

// Create an enum class and declare dialog types inside
enum class DialogType {
    DIALOG_CREATE_CHAT,
    DIALOG_DELETE_MESSAGE,
    DIALOG_EDIT_MESSAGE
}

// Create a sealed class and also created child classes with dialog type
sealed class Dialog {
    object CreateChatDialog : Dialog()
    object DeleteMessageDialog : Dialog()
    object EditeMessageDialog : Dialog()
}

// Handy way to create objects of similar type
object DialogFactory {

    fun createDialog(dialogType: DialogType): Dialog {
        return when (dialogType) {
            DialogType.DIALOG_CREATE_CHAT -> Dialog.CreateChatDialog
            DialogType.DIALOG_DELETE_MESSAGE -> Dialog.DeleteMessageDialog
            DialogType.DIALOG_EDIT_MESSAGE -> Dialog.EditeMessageDialog
        }
    }
}
