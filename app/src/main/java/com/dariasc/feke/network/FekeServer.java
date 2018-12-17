package com.dariasc.feke.network;

import android.content.Context;

import java.util.List;

public interface FekeServer {

    void initialize(Context context);

    List<FekeClient> getClients();

}
