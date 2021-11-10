package com.xiwna.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.xiwna.stub.router.RouterInit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingping
 */
public class Routers {

    private static List<Mapping> mappings = new ArrayList<>();

    public static void map(String path, Class<? extends Activity> activity, MethodInvoker method) {
        mappings.add(new Mapping(path, activity, method));
    }

    /**
     * 通过 router 打开 activity
     *
     * @param context
     * @param url
     * @return
     */
    public static boolean open(Context context, String url) {
        Uri uri = Uri.parse(url);
        for (Mapping mapping : mappings) {
            if (mapping.match(uri)) {
                Intent intent = new Intent(context, mapping.getActivity());
                intent.putExtras(mapping.parseExtras(uri));
                context.startActivity(intent);
                return true;
            }
        }
        return false;
    }
}
