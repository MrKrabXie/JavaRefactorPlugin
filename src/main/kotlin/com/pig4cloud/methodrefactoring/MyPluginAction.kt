package com.pig4cloud.methodrefactoring

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages


class MyPluginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog(
            e.project,
            "Hello from My Plugin!",
            "Greeting",
            Messages.getInformationIcon()
        )
    }
}
