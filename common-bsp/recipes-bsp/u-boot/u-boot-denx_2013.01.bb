require u-boot.inc

# SPL build
UBOOT_BINARY = "u-boot.img"
UBOOT_IMAGE = "u-boot-${MACHINE}-${PV}-${PR}.img"
UBOOT_SYMLINK = "u-boot-${MACHINE}.img"

PV = "2013.01+2013.04-rc1"
PR = "r3"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(beaglebone)"

# File is board-specific, only copy when it will be correct.
FWENV = ""

SRC_URI = "git://git.denx.de/u-boot-arm.git \
           file://0001-beaglebone-default-to-beaglebone-black-for-unknown-E.patch \
           file://0002-am335x-mux-don-t-hang-on-unknown-EEPROMs-assume-Beag.patch \
           file://0003-beaglebone-HACK-always-return-1-for-is_bone_lt.patch \
           file://0004-beaglebone-HACK-raise-USB-current-limit.patch \
           file://0005-beaglebone-use-kloadaddr-to-avoid-copying-the-kernel.patch \
           file://0006-beaglebone-try-to-load-uEnv-uImage-from-eMMC-first.patch \
           file://0007-beaglebone-Don-t-trigger-uboot-variable-lenght-limit.patch \
           file://0008-beaglebone-HACK-change-mmc-order-to-avoid-u-boot-cra.patch \
           file://0009-beaglebone-update-bootpart-variable-after-mmc-scan.patch \
           file://0010-am335x_evm-enable-gpio-command.patch \
           file://0011-am335x_evm-HACK-to-turn-on-BeagleBone-LEDs.patch \
           file://0012-am335x-Enable-MMC1-clock.patch \
           file://0013-Fix-for-screen-rolling-when-video-played-back-in-bro.patch \
           file://0014-beaglebone-replace-303MHz-DDR3-timings-with-400MHz-o.patch \
           ${FWENV} \
          "

SRCREV = "009d75ccc11d27b9a083375a88bb93cb746b4800"

LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

S = "${WORKDIR}/git"

