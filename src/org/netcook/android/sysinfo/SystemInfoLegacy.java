package org.netcook.android.sysinfo;

public class SystemInfoLegacy extends AbstractSystemInfo {

	@Override
	public String build() {
		StringBuilder sb = new StringBuilder("--SYSTEM Legacy--").append(DELIMITER);
		add(sb, "BOARD", android.os.Build.BOARD);
		add(sb, "BRAND", android.os.Build.BRAND);
		add(sb, "CPU_ABI", android.os.Build.CPU_ABI);
		add(sb, "DEVICE", android.os.Build.DEVICE);
		add(sb, "DISPLAY", android.os.Build.DISPLAY);
		add(sb, "FINGERPRINT", android.os.Build.FINGERPRINT);
		add(sb, "HOST", android.os.Build.HOST);
		add(sb, "ID", android.os.Build.ID);
		add(sb, "MANUFACTURER", android.os.Build.MANUFACTURER);
		add(sb, "MODEL", android.os.Build.MODEL);
		add(sb, "PRODUCT", android.os.Build.PRODUCT);
		add(sb, "TAGS", android.os.Build.TAGS);
		add(sb, "TYPE", android.os.Build.TYPE);
		add(sb, "UNKNOWN", android.os.Build.UNKNOWN);
		add(sb, "USER", android.os.Build.USER);
		add(sb, "TIME", String.valueOf(android.os.Build.TIME));
		return sb.toString();
	}

}
