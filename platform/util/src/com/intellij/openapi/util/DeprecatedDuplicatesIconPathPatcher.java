// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.util;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Konstantin Bulenkov
 */
public class DeprecatedDuplicatesIconPathPatcher extends IconPathPatcher {
  @NonNls private static final Map<String, String> ourDeprecatedIconsReplacements = new HashMap<String, String>();

  static {
    ourDeprecatedIconsReplacements.put("/actions/prevfile.png", "AllIcons.Actions.Back");
    ourDeprecatedIconsReplacements.put("/actions/prevfile.svg", "AllIcons.Actions.Back");

    ourDeprecatedIconsReplacements.put("/modules/edit.png", "AllIcons.Actions.Edit");
    ourDeprecatedIconsReplacements.put("/modules/edit.svg", "AllIcons.Actions.Edit");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/edit.png", "AllIcons.Actions.Edit");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/edit.svg", "AllIcons.Actions.Edit");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/edit.png", "AllIcons.Actions.Edit");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/edit.svg", "AllIcons.Actions.Edit");

    ourDeprecatedIconsReplacements.put("/actions/findPlain.png", "AllIcons.Actions.Find");
    ourDeprecatedIconsReplacements.put("/actions/findPlain.svg", "AllIcons.Actions.Find");
    ourDeprecatedIconsReplacements.put("/actions/menu_find.png", "AllIcons.Actions.Find");
    ourDeprecatedIconsReplacements.put("/actions/menu_find.svg", "AllIcons.Actions.Find");

    ourDeprecatedIconsReplacements.put("/actions/nextfile.png", "AllIcons.Actions.Forward");
    ourDeprecatedIconsReplacements.put("/actions/nextfile.svg", "AllIcons.Actions.Forward");

    ourDeprecatedIconsReplacements.put("/actions/menu_help.png", "AllIcons.Actions.Help");
    ourDeprecatedIconsReplacements.put("/actions/menu_help.svg", "AllIcons.Actions.Help");

    ourDeprecatedIconsReplacements.put("/debugger/threadStates/io.png", "AllIcons.Actions.Menu_saveall");
    ourDeprecatedIconsReplacements.put("/debugger/threadStates/io.svg", "AllIcons.Actions.Menu_saveall");

    ourDeprecatedIconsReplacements.put("/actions/sortAsc.png", "AllIcons.Actions.MoveDown");
    ourDeprecatedIconsReplacements.put("/actions/sortAsc.svg", "AllIcons.Actions.MoveDown");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/moveDown.png", "AllIcons.Actions.MoveDown");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/moveDown.svg", "AllIcons.Actions.MoveDown");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/moveDown.png", "AllIcons.Actions.MoveDown");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/moveDown.svg", "AllIcons.Actions.MoveDown");

    ourDeprecatedIconsReplacements.put("/actions/sortDesc.png", "AllIcons.Actions.MoveUp");
    ourDeprecatedIconsReplacements.put("/actions/sortDesc.svg", "AllIcons.Actions.MoveUp");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/moveUp.png", "AllIcons.Actions.MoveUp");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/moveUp.svg", "AllIcons.Actions.MoveUp");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/moveUp.png", "AllIcons.Actions.MoveUp");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/moveUp.svg", "AllIcons.Actions.MoveUp");

    ourDeprecatedIconsReplacements.put("/debugger/threadStates/paused.png", "AllIcons.Actions.Pause");
    ourDeprecatedIconsReplacements.put("/debugger/threadStates/paused.svg", "AllIcons.Actions.Pause");

    ourDeprecatedIconsReplacements.put("/actions/showSource.png", "AllIcons.Actions.Preview");
    ourDeprecatedIconsReplacements.put("/actions/showSource.svg", "AllIcons.Actions.Preview");

    ourDeprecatedIconsReplacements.put("/actions/browser-externalJavaDoc.png", "AllIcons.Actions.PreviousOccurence");
    ourDeprecatedIconsReplacements.put("/actions/browser-externalJavaDoc.svg", "AllIcons.Actions.PreviousOccurence");

    ourDeprecatedIconsReplacements.put("/actions/sync.png", "AllIcons.Actions.Refresh");
    ourDeprecatedIconsReplacements.put("/actions/sync.svg", "AllIcons.Actions.Refresh");
    ourDeprecatedIconsReplacements.put("/actions/synchronizeFS.png", "AllIcons.Actions.Refresh");
    ourDeprecatedIconsReplacements.put("/actions/synchronizeFS.svg", "AllIcons.Actions.Refresh");
    ourDeprecatedIconsReplacements.put("/vcs/refresh.png", "AllIcons.Actions.Refresh");
    ourDeprecatedIconsReplacements.put("/vcs/refresh.svg", "AllIcons.Actions.Refresh");

    ourDeprecatedIconsReplacements.put("/actions/refreshUsages.png", "AllIcons.Actions.Rerun");
    ourDeprecatedIconsReplacements.put("/actions/refreshUsages.svg", "AllIcons.Actions.Rerun");

    ourDeprecatedIconsReplacements.put("/debugger/threadStates/running.png", "AllIcons.Actions.Resume");
    ourDeprecatedIconsReplacements.put("/debugger/threadStates/running.svg", "AllIcons.Actions.Resume");

    ourDeprecatedIconsReplacements.put("/actions/reset.png", "AllIcons.Actions.Rollback");
    ourDeprecatedIconsReplacements.put("/actions/reset.svg", "AllIcons.Actions.Rollback");

    ourDeprecatedIconsReplacements.put("/vcs/mergeSourcesTree.png", "AllIcons.Actions.ShowAsTree");
    ourDeprecatedIconsReplacements.put("/vcs/mergeSourcesTree.svg", "AllIcons.Actions.ShowAsTree");

    ourDeprecatedIconsReplacements.put("/general/debug.png", "AllIcons.Actions.StartDebugger");
    ourDeprecatedIconsReplacements.put("/general/debug.svg", "AllIcons.Actions.StartDebugger");


    ourDeprecatedIconsReplacements.put("/debugger/watches.png", "AllIcons.Debugger.Watch");
    ourDeprecatedIconsReplacements.put("/debugger/watches.svg", "AllIcons.Debugger.Watch");


    ourDeprecatedIconsReplacements.put("/debugger/newWatch.png", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/debugger/newWatch.svg", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/modules/addContentEntry.png", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/modules/addContentEntry.svg", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/add.png", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/add.svg", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/add.png", "AllIcons.General.Add");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/add.svg", "AllIcons.General.Add");

    ourDeprecatedIconsReplacements.put("/compiler/error.png", "AllIcons.General.Error");
    ourDeprecatedIconsReplacements.put("/compiler/error.svg", "AllIcons.General.Error");
    ourDeprecatedIconsReplacements.put("/ide/errorSign.png", "AllIcons.General.Error");
    ourDeprecatedIconsReplacements.put("/ide/errorSign.svg", "AllIcons.General.Error");

    ourDeprecatedIconsReplacements.put("/actions/filter_small.png", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/actions/filter_small.svg", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/ant/filter.png", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/ant/filter.svg", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/debugger/class_filter.png", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/debugger/class_filter.svg", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/inspector/useFilter.png", "AllIcons.General.Filter");
    ourDeprecatedIconsReplacements.put("/inspector/useFilter.svg", "AllIcons.General.Filter");

    ourDeprecatedIconsReplacements.put("/actions/showSettings.png", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/actions/showSettings.svg", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/codeStyle/Gear.png", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/codeStyle/Gear.svg", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/general/projectSettings.png", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/general/projectSettings.svg", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/general/secondaryGroup.png", "AllIcons.General.GearPlain");
    ourDeprecatedIconsReplacements.put("/general/secondaryGroup.svg", "AllIcons.General.GearPlain");

    ourDeprecatedIconsReplacements.put("/compiler/hideWarnings.png", "AllIcons.General.HideWarnings");
    ourDeprecatedIconsReplacements.put("/compiler/hideWarnings.svg", "AllIcons.General.HideWarnings");

    ourDeprecatedIconsReplacements.put("/compiler/information.png", "AllIcons.General.Information");
    ourDeprecatedIconsReplacements.put("/compiler/information.svg", "AllIcons.General.Information");

    ourDeprecatedIconsReplacements.put("/actions/consoleHistory.png", "AllIcons.General.MessageHistory");
    ourDeprecatedIconsReplacements.put("/actions/consoleHistory.svg", "AllIcons.General.MessageHistory");
    ourDeprecatedIconsReplacements.put("/vcs/messageHistory.png", "AllIcons.General.MessageHistory");
    ourDeprecatedIconsReplacements.put("/vcs/messageHistory.svg", "AllIcons.General.MessageHistory");

    ourDeprecatedIconsReplacements.put("/debugger/threadStates/locked.png", "AllIcons.Debugger.MuteBreakpoints");
    ourDeprecatedIconsReplacements.put("/debugger/threadStates/locked.svg", "AllIcons.Debugger.MuteBreakpoints");

    ourDeprecatedIconsReplacements.put("/actions/exclude.png", "AllIcons.General.Remove");
    ourDeprecatedIconsReplacements.put("/actions/exclude.svg", "AllIcons.General.Remove");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/remove.png", "AllIcons.General.Remove");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/remove.svg", "AllIcons.General.Remove");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/remove.png", "AllIcons.General.Remove");
    ourDeprecatedIconsReplacements.put("/toolbarDecorator/mac/remove.svg", "AllIcons.General.Remove");

    ourDeprecatedIconsReplacements.put("/general/applicationSettings.png", "AllIcons.General.Settings");
    ourDeprecatedIconsReplacements.put("/general/applicationSettings.svg", "AllIcons.General.Settings");
    ourDeprecatedIconsReplacements.put("/general/ideOptions.png", "AllIcons.General.Settings");
    ourDeprecatedIconsReplacements.put("/general/ideOptions.svg", "AllIcons.General.Settings");
    ourDeprecatedIconsReplacements.put("/vcs/customizeView.png", "AllIcons.General.Settings");
    ourDeprecatedIconsReplacements.put("/vcs/customizeView.svg", "AllIcons.General.Settings");

    ourDeprecatedIconsReplacements.put("/compiler/warning.png", "AllIcons.General.Warning");
    ourDeprecatedIconsReplacements.put("/compiler/warning.svg", "AllIcons.General.Warning");


    ourDeprecatedIconsReplacements.put("/general/packagesTab.png", "AllIcons.Nodes.CopyOfFolder");
    ourDeprecatedIconsReplacements.put("/general/packagesTab.svg", "AllIcons.Nodes.CopyOfFolder");

    ourDeprecatedIconsReplacements.put("/nodes/treeClosed.png", "AllIcons.Nodes.Folder");
    ourDeprecatedIconsReplacements.put("/nodes/treeClosed.svg", "AllIcons.Nodes.Folder");
    ourDeprecatedIconsReplacements.put("/nodes/treeOpen.png", "AllIcons.Nodes.Folder");
    ourDeprecatedIconsReplacements.put("/nodes/treeOpen.svg", "AllIcons.Nodes.Folder");


    ourDeprecatedIconsReplacements.put("/general/toolWindowChanges.png", "AllIcons.Toolwindows.ToolWindowChanges");
    ourDeprecatedIconsReplacements.put("/general/toolWindowChanges.svg", "AllIcons.Toolwindows.ToolWindowChanges");
    ourDeprecatedIconsReplacements.put("/general/toolWindowDebugger.png", "AllIcons.Toolwindows.ToolWindowDebugger");
    ourDeprecatedIconsReplacements.put("/general/toolWindowDebugger.svg", "AllIcons.Toolwindows.ToolWindowDebugger");
  }

  @Nullable
  @Override
  public String patchPath(String path) {
    return ourDeprecatedIconsReplacements.get(path);
  }
}
