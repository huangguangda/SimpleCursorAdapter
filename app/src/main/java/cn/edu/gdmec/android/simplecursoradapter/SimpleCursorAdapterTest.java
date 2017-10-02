package cn.edu.gdmec.android.simplecursoradapter;

import android.database.Cursor;
import android.provider.Contacts.People;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class SimpleCursorAdapterTest extends AppCompatActivity {
    private ListView listview;
    private Cursor cursor;
    private SimpleCursorAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_simple_cursor_adapter_test );
        listview=(ListView)findViewById ( R.id.listview );
        cursor=getContentResolver ().query ( People.CONTENT_URI, null, null, null, null );
        startManagingCursor ( cursor );
        adapter=new SimpleCursorAdapter ( this, android.R.layout.simple_expandable_list_item_1, cursor, new String[]{People.NAME}, new int[]{
                android.R.id.text1
        } );
        listview.setAdapter ( adapter );
    }
}
