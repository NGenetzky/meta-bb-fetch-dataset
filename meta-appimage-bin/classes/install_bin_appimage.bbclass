# Use 'D' to help be familiar for poky distros
D ??= "${IMAGE_ROOTFS}"
APPIMAGE_BINDIR ??= "${D}/usr/local/bin"

install_bin_appimage_with_name(){
    # 1 is src, 2 is name at dest
    install -d "${APPIMAGE_BINDIR}"
    install -T "${1}" "${APPIMAGE_BINDIR}/${2}"
}
