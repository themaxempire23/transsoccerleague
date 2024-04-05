package com.company.trans_soccer_league.web.screens.logtable;

import com.haulmont.cuba.gui.screen.*;
import com.company.trans_soccer_league.entity.LogTable;

@UiController("transsoccerleague_LogTable.browse")
@UiDescriptor("log-table-browse.xml")
@LookupComponent("logTablesTable")
@LoadDataBeforeShow
public class LogTableBrowse extends StandardLookup<LogTable> {
    public void onUpdateLogTableClick() {

    }
}