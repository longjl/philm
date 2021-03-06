/*
 * Copyright 2014 Chris Banes
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.philm.in.adapters;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import app.philm.in.R;
import app.philm.in.model.ListItem;
import app.philm.in.model.PhilmPerson;
import app.philm.in.view.PhilmImageView;

public class PersonSectionedListAdapter extends BasePhilmSectionedListAdapter<PhilmPerson> {

    private static final String LOG_TAG = PersonSectionedListAdapter.class.getSimpleName();

    public PersonSectionedListAdapter(Activity activity) {
        super(activity, R.layout.item_list_2line, R.layout.item_list_movie_section_header);
    }

    @Override
    protected void bindView(int position, View view, ListItem<PhilmPerson> item) {
        PhilmPerson person = item.getItem();

        final TextView nameTextView = (TextView) view.findViewById(R.id.textview_title);
        nameTextView.setText(person.getName());

        final PhilmImageView imageView = (PhilmImageView) view.findViewById(R.id.imageview_poster);
        imageView.setAvatarMode(true);
        imageView.loadProfile(person);
    }
}
