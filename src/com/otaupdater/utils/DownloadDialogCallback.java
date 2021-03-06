/*
 * Copyright (C) 2012 OTA Update Center
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.otaupdater.utils;

import android.app.Dialog;

import com.otaupdater.DownloadService.BindUtil.Token;

public interface DownloadDialogCallback extends DialogCallback {
    void onDownloadDialogShown(int dlID, Dialog dlg, Token serviceToken);
    void onDownloadDialogClosed(int dlID, Dialog dlg, Token serviceToken);
}

