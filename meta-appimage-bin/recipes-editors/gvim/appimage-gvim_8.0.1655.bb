SUMMARY = "Vim is a greatly improved version of the good old UNIX editor Vi."
HOMEPAGE = "https://www.vim.org/"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PR = "r1"

inherit bb_fetcher
addtask do_unpack before do_build
SRCFILENAME = "gvim-${PV}-x86_64.AppImage"
SRC_URI = "https://github.com/vim/vim-appimage/releases/download/v8.0.1655/GVim-v8.0.1655-gitf3ba14ffd-glibc2.15.glibc2.15-x86_64.AppImage;downloadfilename=${SRCFILENAME}"
SRC_URI[md5sum] = "e3f1d4143168d0bca0473f88f215c5fe"
SRC_URI[sha256sum] = "ba17d80cf4cdeac362ff6fc601a056d5c20c56da9389a6c23b75110e7dfeeaca"

inherit install_bin_appimage
do_build() {
    install_bin_appimage_with_name "${WORKDIR}/${SRCFILENAME}" "${dest}/gvim"
}
