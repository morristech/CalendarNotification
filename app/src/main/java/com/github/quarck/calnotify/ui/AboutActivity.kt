//
//   Calendar Notifications Plus
//   Copyright (C) 2016 Sergey Parshin (s.parshin.sc@gmail.com)
//
//   This program is free software; you can redistribute it and/or modify
//   it under the terms of the GNU General Public License as published by
//   the Free Software Foundation; either version 3 of the License, or
//   (at your option) any later version.
//
//   This program is distributed in the hope that it will be useful,
//   but WITHOUT ANY WARRANTY; without even the implied warranty of
//   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//   GNU General Public License for more details.
//
//   You should have received a copy of the GNU General Public License
//   along with this program; if not, write to the Free Software Foundation,
//   Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
//

package com.github.quarck.calnotify.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView

import com.github.quarck.calnotify.R
import com.github.quarck.calnotify.utils.find

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        setSupportActionBar(find<Toolbar?>(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val versionText = find<TextView?>(R.id.text_view_app_version)

        val pInfo = packageManager.getPackageInfo(packageName, 0);
        versionText?.text = pInfo.versionName

    }

    @Suppress("UNUSED_PARAMETER", "unused")
    fun OnTextViewCreditsClick(v: View) = startActivity(Intent.parseUri(imageCreditUri, 0))

    @Suppress("UNUSED_PARAMETER", "unused")
    fun OnTextViewKotlinClick(v: View) = startActivity(Intent.parseUri(kotlinUri, 0))

    @Suppress("UNUSED_PARAMETER", "unused")
    fun OnTextViewGitHubClick(v: View) = startActivity(Intent.parseUri(githubUri, 0))

    companion object {
        val imageCreditUri = "http://cornmanthe3rd.deviantart.com/"
        val kotlinUri = "https://kotlinlang.org/"
        val githubUri = "https://github.com/quarck/CalendarNotification"
    }
}
